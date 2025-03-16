param (
    [string]$ProjectName, # Accepts the project name as an argument
    [string]$GroupId = "com.example"    # Default groupId, but can be overridden
)

# Set base directory for Sloth Bytes
$BaseDir = "$PSScriptRoot"
$ProjectDir = "$BaseDir\$ProjectName"

# Ensure the base directory exists
if (-Not (Test-Path $BaseDir))
{
    Write-Host "Error: The sloth-bytes directory does not exist!" -ForegroundColor Red
    exit 1
}

# Ensure the project name is provided
if (-Not $ProjectName)
{
    Write-Host "Error: Please provide a project name." -ForegroundColor Red
    exit 1
}

# Check if the project already exists
if (Test-Path $ProjectDir)
{
    Write-Host "Error: Project '$ProjectName' already exists!" -ForegroundColor Yellow
    exit 1
}

# Run Maven Wrapper
Write-Host "Generating new Maven project named '$ProjectName' with a proper structure (groupId: $GroupId)" -ForegroundColor Cyan
$mavenOutput = .\mvnw archetype:generate `
    "-DgroupId=$GroupId" `
    "-DartifactId=$ProjectName" `
    "-DarchetypeArtifactId=maven-archetype-quickstart" `
    "-DinteractiveMode=false" `
    "-Dpackage=$GroupId" `
    "-B" 2>&1

if ($LASTEXITCODE -ne 0)
{
    Write-Host "Error: Maven project generation failed!" -ForegroundColor Red
    $mavenOutput -split "`r`n" | ForEach-Object {
        Write-Host $_ -ForegroundColor Red
    }
    exit 1
}

# Ensure the Maven project was actually created
if (-Not (Test-Path "$ProjectDir\pom.xml"))
{
    Write-Host "Error: Maven project was not created successfully!" -ForegroundColor Red
    exit 1
}

# Add a README file with only the project name as a header
Set-Content -Path "$ProjectDir\README.md" -Value "# $ProjectName"

Write-Host "Project '$ProjectName' has been set up successfully!" -ForegroundColor Green