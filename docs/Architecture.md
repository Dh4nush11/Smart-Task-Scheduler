# System Architecture

## Architecture Pattern

The application follows the MVC (Model-View-Controller) architecture.

### Layers

Presentation Layer
- Thymeleaf
- Bootstrap
- HTML
- CSS

Business Layer
- Services
- Scheduler
- Validation

Persistence Layer
- JPA
- Hibernate
- MySQL

## Workflow

User
↓

Controller
↓

Service
↓

Repository
↓

Database

## Design Principles

- SOLID Principles
- Layered Architecture
- Dependency Injection
- Repository Pattern
- MVC Pattern
