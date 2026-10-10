@echo off
title Radha Raman Education Institute - School Management System
color 1f
cls
echo ======================================================================
echo    RADHA RAMAN EDUCATION INSTITUTE - SCHOOL MANAGEMENT SYSTEM
echo ======================================================================
echo.
echo Starting application background service...
echo Please wait 5 seconds while system initializes...
echo.

:: Check if Java is installed
where java >nul 2>nul
if %errorlevel% neq 0 (
    echo [ERROR] Java is not installed or not in PATH!
    echo Please install Java 17 or higher from https://adoptium.net/
    echo.
    pause
    exit /b
)

:: Run Spring Boot JAR in background if executable exists, or run via mvnw
if exist "school-management-system-0.0.1-SNAPSHOT.jar" (
    start "School Management System Service" /min java -jar school-management-system-0.0.1-SNAPSHOT.jar
) else if exist "target\school-management-system-0.0.1-SNAPSHOT.jar" (
    start "School Management System Service" /min java -jar target\school-management-system-0.0.1-SNAPSHOT.jar
) else (
    echo Building project JAR file for the first time...
    call mvnw.cmd clean package -DskipTests
    start "School Management System Service" /min java -jar target\school-management-system-0.0.1-SNAPSHOT.jar
)

:: Wait 5 seconds for Spring Boot server to start
timeout /t 5 /nobreak >nul

:: Open web browser automatically
echo Opening School Management System in your Browser...
start http://localhost:8080

echo.
echo ======================================================================
echo [SUCCESS] Application is now RUNNING!
echo You can use the app in your browser window.
echo Keep this window open while using the system.
echo Press any key to stop the system when finished.
echo ======================================================================
pause >nul
