# Bank Application

# Project Overview

The **Bank Application** is a Spring Boot-based web application designed to provide users with information about bank branches and the services offered by a specific bank. This application leverages RESTful API principles to serve dynamic content, enhancing user experience with a responsive and interactive interface.

## Features
**Branch Information:** Users can retrieve a list of bank branches located in Bangalore. Each branch's details are presented in a structured table format for easy navigation.
  
**Services Offered:** Users can view a comprehensive list of services provided by the bank, ensuring that they have all necessary information to make informed decisions.

## Technology Stack

**Backend:** Spring Boot
**Database:** MySQL
**Build Tool:** Maven
**Deployment:** Railway

# Getting Started

# Prerequisites

- Java 17
- Maven
- MySQL (for local development)

# Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/bank.git
   cd bank
   ```

2. Configure your database connection in `application.properties`.

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### Deployment

The application is deployed on Railway. You can access the live application at:
[Bank Application](https://bank-production-f074.up.railway.app/)

## Usage

- Access the list of branches at: 
  ```
  https://bank-production-f074.up.railway.app/branches
  ```

- View the services offered by the bank at: 
  ```
  https://bank-production-f074.up.railway.app/services
  ```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request if you have suggestions for improvements or new features.

