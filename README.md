GitHub CI Integration for SonarQube
This guide will walk you through the process of integrating SonarQube analysis with GitHub Actions using a Maven project.

Step 1: Create GitHub Secrets
Before setting up the GitHub Actions workflow, you need to create two secrets in your GitHub repository to authenticate with SonarQube.

1.1. Create a SONAR_TOKEN Secret
In your GitHub repository, navigate to Settings > Secrets.

Click on New repository secret.

In the Name field, enter SONAR_TOKEN.

In the Value field, enter an existing SonarQube token or generate a new one from your SonarQube instance.

Click Add secret.

1.2. Create a SONAR_HOST_URL Secret
In the Settings > Secrets section of your repository, click on New repository secret again.

In the Name field, enter SONAR_HOST_URL.

In the Value field, enter the SonarQube server URL, typically http://localhost:9000.

Click Add secret.

Step 2: Create or Update Workflow YAML File
Now, let's create or update the GitHub Actions workflow YAML file to automatically run SonarQube analysis on your project.

2.1. Select Your Project Type
Choose the build tool your project uses:

Maven

Gradle

.NET

Other (for JS, TS, Go, Python, PHP, etc.)

In this example, we'll focus on a Maven project.

2.2. Workflow Configuration
Create or edit the .github/workflows/build.yml file in your repository with the following content

2.3. Explanation of Workflow Steps
Checkout Code: This step pulls the latest code from your repository.

Set Up JDK 17: Sets up the Java Development Kit to run your Maven build.

Cache SonarQube Packages: Caches SonarQube packages to speed up future builds.

Cache Maven Packages: Caches Maven dependencies to avoid downloading them on each build.

Build and Analyze: Runs the Maven build and triggers SonarQube analysis using the sonar-maven-plugin.

Step 3: Monitor the Build and Analysis
Once you've pushed the .github/workflows/build.yml file to your GitHub repository, GitHub Actions will automatically run the pipeline on every push to the main branch.

To monitor the build status, go to the Actions tab in your GitHub repository.

Check the logs for any errors or to see the analysis results.
