## � Live Deployment

- **Frontend:** https://e-notes-frontend.vercel.app
- **Backend API:** https://e-notes-backend-7mxe.onrender.com

---

## �🎬 Project Demo

### 📹 Video Demonstration
Watch the complete walkthrough of E-Notes application:

<div align="center">
  <iframe src="https://drive.google.com/file/d/1j_85LqEtRVHW0NE4kdn2SA8pkHAbptJV/preview" width="640" height="480" allow="autoplay" allowfullscreen></iframe>
</div>

*Video embedded from Google Drive - click play to watch*


## 📸 Application Screenshots

### 🏠 Home Page
The landing page with application overview and navigation.

![Home Page](screenshots/Home%20Page.png)

---

### 🔑 Authentication

#### Login Page
Secure login with JWT authentication and OAuth2 social login options (Google & GitHub).

![Login Page](screenshots/Login%20Page.png)

#### Register Page
User registration form with email validation.

![Register Page](screenshots/Register%20Page.png)

---

### 📝 Notes Management

#### View Notes
Dashboard displaying all user notes with edit and delete options.

![View Notes](screenshots/View%20Notes.png)

#### Add Notes
Create new notes with title, description, and file attachment support (up to 10MB).

![Add Notes](screenshots/Add%20Notes.png)

---

### 👤 User Profile
User profile page showing account information and notes management access.

![Profile Page](screenshots/Profile%20Page.png)

---

### ℹ️ About Page
Information about the application, features, and technology stack.

![About Page](screenshots/About%20Page.png)

---

# 📝 E-Notes - Secure Digital Note Management System

> A full-stack web application for creating, managing, and organizing your notes securely in the cloud. Built with modern technologies and OAuth2 social authentication.

![Java](https://img.shields.io/badge/Java-22-orange?style=flat&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.2-brightgreen?style=flat&logo=spring)
![React](https://img.shields.io/badge/React-19-blue?style=flat&logo=react)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=flat&logo=mysql)
![AWS S3](https://img.shields.io/badge/AWS_S3-File_Storage-FF9900?style=flat&logo=amazon-s3&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-Auth-000000?style=flat&logo=jsonwebtokens)

---

## 🎯 Project Overview

**E-Notes** is a comprehensive note-taking application that allows users to create, edit, organize, and securely store their notes with file attachments. The application features robust authentication mechanisms including traditional email/password login and OAuth2 integration with Google and GitHub.

### Core Tech Stack:
- **Backend:** Java 22, Spring Boot 3.3.2, Spring Security, Spring Data JPA
- **Frontend:** React 19, Vite, Tailwind CSS, DaisyUI
- **Database:** MySQL 8.0
- **File Storage:** AWS S3 (Amazon Simple Storage Service)
- **Authentication:** JWT, OAuth2 (Google & GitHub)
- **Build Tools:** Maven, npm

### What it does:
E-Notes is a secure digital note management platform where users can:
- Create and manage personal notes with rich text descriptions
- Attach files to notes (up to 10MB per file)
- Organize notes by user email-based storage system
- Access notes from anywhere with secure authentication
- Admin dashboard for user management

### Key Features:
- **JWT Authentication** - Stateless token-based authentication
- **OAuth2 Social Login** - Google and GitHub integration
- **File Upload System** - Attach documents, images, and files to notes, stored securely in AWS S3
- **Role-Based Access Control** - Separate User and Admin roles
- **RESTful API** - Clean and documented API endpoints
- **Responsive UI** - Works seamlessly on desktop and mobile devices
- **Secure Storage** - User-isolated file storage in AWS S3 with per-user folder prefixes

---

## 🛠️ Tech Stack

### Backend Technologies
| Technology | Version | Purpose |
|------------|---------|---------|
| ![Java](https://img.shields.io/badge/Java-22-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) | 22 | Core Programming Language |
| ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.2-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white) | 3.3.2 | Backend Framework |
| ![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white) | 6.x | Security & Authentication |
| ![MySQL](https://img.shields.io/badge/MySQL-8.0-00758F?style=for-the-badge&logo=mysql&logoColor=white) | 8.0+ | Database |
| ![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=white) | 0.11.5 | Token Authentication |
| ![AWS S3](https://img.shields.io/badge/AWS_S3-FF9900?style=for-the-badge&logo=amazon-s3&logoColor=white) | SDK 2.x | Cloud File Storage |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white) | 3.6+ | Build & Dependency Management |

### Frontend Technologies
| Technology | Version | Purpose |
|------------|---------|---------|
| ![React](https://img.shields.io/badge/React-19-20232A?style=for-the-badge&logo=react&logoColor=61DAFB) | 19.1.0 | UI Library |
| ![Vite](https://img.shields.io/badge/Vite-6.2.0-646CFF?style=for-the-badge&logo=vite&logoColor=white) | 6.2.0 | Build Tool |
| ![TailwindCSS](https://img.shields.io/badge/Tailwind_CSS-3.4.17-38B2AC?style=for-the-badge&logo=tailwind-css&logoColor=white) | 3.4.17 | CSS Framework |
| ![DaisyUI](https://img.shields.io/badge/DaisyUI-5.0.9-5A0EF8?style=for-the-badge&logo=daisyui&logoColor=white) | 5.0.9 | UI Components |
| ![React Router](https://img.shields.io/badge/React_Router-7.4.1-CA4245?style=for-the-badge&logo=react-router&logoColor=white) | 7.4.1 | Routing |
| ![Axios](https://img.shields.io/badge/Axios-1.8.4-5A29E4?style=for-the-badge&logo=axios&logoColor=white) | 1.8.4 | HTTP Client |

---

## ✨ Features

### 🔐 Authentication & Security
- ✅ JWT-based stateless authentication
- ✅ OAuth2 integration with Google
- ✅ OAuth2 integration with GitHub
- ✅ Secure password encryption
- ✅ Role-based access control (User/Admin)
- ✅ Protected API endpoints

### 📝 Note Management
- ✅ Create notes with title and description
- ✅ Edit existing notes
- ✅ Delete notes
- ✅ View all user notes
- ✅ Timestamp tracking (creation date)

### 📎 File Management
- ✅ Upload files with notes (max 10MB per file)
- ✅ Multiple file format support (PDF, JPG, JPEG, PNG, WEBP)
- ✅ Cloud storage with **AWS S3** (Amazon Simple Storage Service)
- ✅ User-isolated storage using `{user-email}/` folder prefixes inside the S3 bucket
- ✅ UUID-based file naming to prevent name collisions
- ✅ File deletion from S3 when a note is removed

### 👤 User Management
- ✅ User registration and login
- ✅ Profile management
- ✅ View user information
- ✅ Admin dashboard for user overview

### 🎨 UI/UX
- ✅ Responsive design for all devices
- ✅ Modern and clean interface
- ✅ Toast notifications for user feedback
- ✅ Loading states and error handling
- ✅ Intuitive navigation

---

## 🏗️ System Architecture

### Architecture Diagram

```
┌─────────────────────────────────────────────────────────────────────┐
│                         CLIENT LAYER                                 │
│  ┌───────────────────────────────────────────────────────────────┐  │
│  │  React Frontend (Port 5173)                                    │  │
│  │  ├── Components (Navbar, Footer)                               │  │
│  │  ├── Pages (Home, Login, Register, Notes, Profile)            │  │
│  │  ├── Context (UserContext)                                     │  │
│  │  ├── Services (UserService, AxiosHelper)                       │  │
│  │  └── Routes (PrivateRoute Protection)                          │  │
│  └───────────────────────────────────────────────────────────────┘  │
└────────────────────────────┬────────────────────────────────────────┘
                             │ HTTP/HTTPS
                             │ REST API Calls
                             │ JSON Data Transfer
                             ▼
┌─────────────────────────────────────────────────────────────────────┐
│                      API GATEWAY LAYER                               │
│  ┌───────────────────────────────────────────────────────────────┐  │
│  │  Spring Boot Backend (Port 8080)                               │  │
│  │  ├── @RestController (API Endpoints)                           │  │
│  │  ├── @CrossOrigin (CORS Configuration)                         │  │
│  │  └── JWT Filter (Token Validation)                             │  │
│  └───────────────────────────────────────────────────────────────┘  │
└────────────────────────────┬────────────────────────────────────────┘
                             │
                             ▼
┌─────────────────────────────────────────────────────────────────────┐
│                       SECURITY LAYER                                 │
│  ┌───────────────────────────────────────────────────────────────┐  │
│  │  Spring Security                                                │  │
│  │  ├── JWT Authentication Filter                                 │  │
│  │  ├── OAuth2 Success Handler                                    │  │
│  │  ├── Custom UserDetailsService                                 │  │
│  │  └── Security Configuration                                    │  │
│  └───────────────────────────────────────────────────────────────┘  │
└────────────────────────────┬────────────────────────────────────────┘
                             │
                             ▼
┌─────────────────────────────────────────────────────────────────────┐
│                      BUSINESS LOGIC LAYER                            │
│  ┌───────────────────────────────────────────────────────────────┐  │
│  │  Services                                                       │  │
│  │  ├── UserServiceImpl (User CRUD operations)                    │  │
│  │  ├── NotesServiceImpl (Notes CRUD operations)                  │  │
│  │  └── JwtService (Token generation & validation)                │  │
│  └───────────────────────────────────────────────────────────────┘  │
└────────────────────────────┬────────────────────────────────────────┘
                             │
                             ▼
┌─────────────────────────────────────────────────────────────────────┐
│                      DATA ACCESS LAYER                               │
│  ┌───────────────────────────────────────────────────────────────┐  │
│  │  Spring Data JPA Repositories                                   │  │
│  │  ├── UserRepo (User Entity)                                    │  │
│  │  └── NotesRepository (Notes Entity)                            │  │
│  └───────────────────────────────────────────────────────────────┘  │
└────────────────────────────┬────────────────────────────────────────┘
                             │
                             ▼
┌─────────────────────────────────────────────────────────────────────┐
│                       DATABASE LAYER                                 │
│  ┌───────────────────────────────────────────────────────────────┐  │
│  │  MySQL Database (enotes_db)                                     │  │
│  │  ├── users table                                                │  │
│  │  └── notes table                                                │  │
│  └───────────────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────────┐
│                       FILE STORAGE LAYER                             │
│  ┌───────────────────────────────────────────────────────────────┐  │
│  │  AWS S3 Bucket (e-notes) - ap-south-1                         │  │
│  │  └── {user-email}/                                              │  │
│  │      └── {uuid}-{original-file-name}                            │  │
│  └───────────────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────────┐
│                    EXTERNAL SERVICES                                 │
│  ├── Google OAuth2 API                                              │
│  ├── GitHub OAuth2 API                                              │
│  └── AWS S3 (Cloud file storage)                                    │
└─────────────────────────────────────────────────────────────────────┘
```

### Communication Flow

#### 1. **User Authentication Flow**
```
User → Frontend (Login Page) → POST /api/auth/login 
→ Backend (Spring Security) → Validate Credentials 
→ Generate JWT Token → Return Token to Frontend 
→ Store in LocalStorage → Include in All Future Requests
```

#### 2. **OAuth2 Social Login Flow**
```
User Clicks "Sign in with Google/GitHub" 
→ Redirect to OAuth Provider 
→ User Authorizes 
→ Redirect to /login/oauth2/code/{provider} 
→ CustomOAuth2SuccessHandler 
→ Generate JWT Token 
→ Redirect to Frontend with Token
```

#### 3. **Notes CRUD Operations Flow**
```
Frontend → Protected Route Check → JWT Token Validation 
→ API Request with Bearer Token 
→ Backend JWT Filter → Extract User from Token 
→ Service Layer → Repository Layer → Database 
→ Return Response → Update UI
```

#### 4. **File Upload Flow**
```
User Selects File → Frontend (FormData) 
→ POST /api/user/file/saveNotes (multipart/form-data) 
→ Backend validates file size & type (max 5MB, PDF/JPG/PNG/WEBP) 
→ Upload file to AWS S3 as {userEmail}/{uuid}-{fileName} 
→ Save note metadata (with S3 object key) to database 
→ Return success response
```

---

## 🚀 How to Run

### Prerequisites

Before running the application, ensure you have:

- ✅ **Java Development Kit (JDK) 22** or higher
- ✅ **Maven 3.6+** for backend dependency management
- ✅ **Node.js 18+** and npm for frontend
- ✅ **MySQL 8.0+** database server
- ✅ **AWS account** with an S3 bucket and IAM credentials for cloud file storage
- ✅ **Git** for version control

### Step 1: Clone the Repository

```bash
git clone <your-repository-url>
cd E-Notes
```

### Step 2: Database Setup

1. Start your MySQL server

2. Create the database:
```sql
CREATE DATABASE enotes_db;
```

3. (Optional) Create a MySQL user:
```sql
CREATE USER 'enotes_user'@'localhost' IDENTIFIED BY 'your_password';
GRANT ALL PRIVILEGES ON enotes_db.* TO 'enotes_user'@'localhost';
FLUSH PRIVILEGES;
```

### Step 3: Backend Configuration

1. Navigate to the backend directory:
```bash
cd ENotes
```

2. Update `src/main/resources/application.properties`:

```properties
# Server Configuration
spring.application.name=ENotes
server.port=8080

# Database Configuration
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/enotes_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update

# File Upload Configuration
spring.servlet.multipart.enabled=true
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=20MB

# AWS S3 Configuration (Cloud File Storage)
aws.region=ap-south-1
aws.s3.bucket-name=YOUR_S3_BUCKET_NAME

# Google OAuth2 Configuration
spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_CLIENT_SECRET
spring.security.oauth2.client.registration.google.redirect-uri=http://localhost:8080/login/oauth2/code/google
spring.security.oauth2.client.registration.google.scope=email,profile

# GitHub OAuth2 Configuration
spring.security.oauth2.client.registration.github.client-id=YOUR_GITHUB_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_GITHUB_CLIENT_SECRET
spring.security.oauth2.client.registration.github.redirect-uri=http://localhost:8080/login/oauth2/code/github
spring.security.oauth2.client.registration.github.scope=read:user,user:email

# JWT Secret Key (Generate your own using SecretKeyGenerator.java)
jwt.secret=YOUR_JWT_SECRET_KEY

# AWS Credentials (set as environment variables: AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY)
```

3. Create an AWS S3 bucket for file storage:
   1. Go to the [AWS S3 Console](https://console.aws.amazon.com/s3/)
   2. Click **Create bucket**, name it (e.g. `e-notes`), and select a region (the app defaults to `ap-south-1`)
   3. Keep the default settings — block all public access (files are accessed privately by the backend)
   4. Create an IAM user/role with `s3:PutObject`, `s3:GetObject`, and `s3:DeleteObject` permissions on the bucket
   5. Set your AWS credentials as environment variables (the app uses the default AWS credential chain):
   ```bash
   export AWS_ACCESS_KEY_ID=YOUR_ACCESS_KEY_ID
   export AWS_SECRET_ACCESS_KEY=YOUR_SECRET_ACCESS_KEY
   ```
   Update `aws.region` and `aws.s3.bucket-name` in `application.properties` to match your bucket.

4. Install dependencies and build:
```bash
mvn clean install
```

### Step 4: OAuth2 Setup (Optional but Recommended)

#### Google OAuth2:
1. Go to [Google Cloud Console](https://console.cloud.google.com/)
2. Create a new project or select existing
3. Navigate to "APIs & Services" → "Credentials"
4. Click "Create Credentials" → "OAuth 2.0 Client ID"
5. Add authorized redirect URI: `http://localhost:8080/login/oauth2/code/google`
6. Copy Client ID and Client Secret to `application.properties`

#### GitHub OAuth2:
1. Go to [GitHub Developer Settings](https://github.com/settings/developers)
2. Click "New OAuth App"
3. Fill in the details:
   - Application name: E-Notes
   - Homepage URL: `http://localhost:8080`
   - Authorization callback URL: `http://localhost:8080/login/oauth2/code/github`
4. Copy Client ID and Client Secret to `application.properties`

### Step 5: Run the Backend

```bash
# Option 1: Using Maven
mvn spring-boot:run

# Option 2: Using Java
mvn clean package
java -jar target/ENotes-0.0.1-SNAPSHOT.jar
```

The backend will start on **http://localhost:8080**

You should see output like:
```
Started ENotesApplication in X.XXX seconds
```

### Step 6: Frontend Configuration

1. Navigate to the frontend directory:
```bash
cd ../ENotes-Frontend
```

2. Install dependencies:
```bash
npm install
```

3. (Optional) Update API base URL in `src/config/AxiosHelper.js` if needed:
```javascript
const BASE_URL = 'http://localhost:8080';
```

### Step 7: Run the Frontend

```bash
npm run dev
```

The frontend will start on **http://localhost:5173**

You should see output like:
```
VITE v6.2.0  ready in XXX ms

➜  Local:   http://localhost:5173/
➜  Network: use --host to expose
```

### Step 8: Access the Application

Open your browser and navigate to:
```
http://localhost:5173/
```

### Step 9: Create Admin User (Optional)

To create an admin user, you can either:

**Option 1: Register normally and update role in database**
```sql
UPDATE user SET role = 'ROLE_ADMIN' WHERE email = 'your-email@example.com';
```

**Option 2: Register with role directly via API (if implemented)**

---

## 📡 API Endpoints

### Authentication Endpoints

| Method | Endpoint | Description | Request Body | Response |
|--------|----------|-------------|--------------|----------|
| POST | `/api/auth/login` | User login with email/password | `{ "email": "string", "password": "string" }` | `{ "token": "jwt_token", "email": "string", "role": "string" }` |
| POST | `/api/auth/logout` | User logout | None | `"Logout Successful"` |
| POST | `/api/saveUser` | Register new user | `{ "fullname": "string", "address": "string", "mobileNo": "string", "email": "string", "password": "string", "confirmPassword": "string" }` | `{ "status": "success", "message": "User registered successfully" }` |
| GET | `/api/profile` | Get user profile | Header: `Authorization: Bearer {token}` | User object |
| GET | `/api/getUser/{email}` | Get user by email | Path: `email` | User object |

### OAuth2 Endpoints

| Method | Endpoint | Description | Parameters |
|--------|----------|-------------|------------|
| GET | `/login/oauth2/code/google` | Google OAuth2 callback | OAuth2 authorization code |
| GET | `/login/oauth2/code/github` | GitHub OAuth2 callback | OAuth2 authorization code |

### Notes Management Endpoints (Requires Authentication)

| Method | Endpoint | Description | Request Body/Params | Response |
|--------|----------|-------------|---------------------|----------|
| GET | `/api/user/viewNotes` | Get all notes for logged-in user | Header: `Authorization: Bearer {token}` | Array of Notes |
| GET | `/api/user/note/{id}` | Get specific note by ID | Path: `id` | Notes object |
| POST | `/api/user/file/saveNotes` | Create new note with file | `multipart/form-data`: `title`, `description`, `userEmail`, `file` | `"Note saved successfully"` |
| PUT | `/api/user/file/updateNotes/{id}` | Update existing note | Path: `id`, `multipart/form-data`: `title`, `description`, `file` | `"Note updated successfully"` |
| GET | `/api/user/deleteNotes/{id}` | Delete note by ID | Path: `id` | Redirect or success message |
| GET | `/api/user/editNotes/{id}` | Get note for editing | Path: `id` | Notes object |

> **Note:** All attached files are stored in an **AWS S3 bucket** under the `{userEmail}/{uuid}-{fileName}` object key pattern.

### Admin Endpoints (Requires ROLE_ADMIN)

| Method | Endpoint | Description | Request | Response |
|--------|----------|-------------|---------|----------|
| GET | `/api/admin/viewUserData` | Get all users | Header: `Authorization: Bearer {token}` | Array of Users |

### Request/Response Examples

#### Login Request
```json
POST /api/auth/login
Content-Type: application/json

{
  "email": "user@example.com",
  "password": "password123"
}
```

#### Login Response
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
  "email": "user@example.com",
  "role": "ROLE_USER"
}
```

#### Create Note Request
```http
POST /api/user/file/saveNotes
Content-Type: multipart/form-data
Authorization: Bearer {jwt_token}

title: My First Note
description: This is a detailed description of my note
userEmail: user@example.com
file: [binary file data]
```

#### Get Notes Response
```json
[
  {
    "id": 1,
    "title": "My First Note",
    "description": "This is a detailed description",
    "fileName": "document.pdf",
    "date": "2025-12-20",
    "userEmail": "user@example.com",
    "user": {
      "id": 1,
      "fullname": "John Doe",
      "email": "user@example.com"
    }
  }
]
```

---

## 📸 Screenshots

### 🏠 Home Page
<div align="center">
  <img src="screenshots/Home Page.png" alt="Home Page" width="800"/>
  <p><em>Welcome to E-Notes! The home page showcases the application's key features including secure note storage, OAuth2 social login integration, and an intuitive user interface. Users can quickly navigate to login, register, or learn more about the platform.</em></p>
</div>

---

### 🔐 Login Page
<div align="center">
  <img src="screenshots/Login Page.png" alt="Login Page" width="800"/>
  <p><em>Secure authentication page with multiple sign-in options. Users can log in using their email and password, or choose OAuth2 social login with Google or GitHub for quick and secure access. The page features form validation and error handling for a smooth user experience.</em></p>
</div>

---

### 📝 Register Page
<div align="center">
  <img src="screenshots/Register Page.png" alt="Register Page" width="800"/>
  <p><em>New user registration form with comprehensive validation. Users provide their full name, address, mobile number, email, and create a secure password. The registration process includes password confirmation and real-time validation to ensure data accuracy before account creation.</em></p>
</div>

---

### ➕ Add Notes
<div align="center">
  <img src="screenshots/Add Notes.png" alt="Add Notes" width="800"/>
  <p><em>Create new notes with rich content and file attachments. The intuitive form allows users to add a descriptive title, detailed content, and upload files up to 10MB. Perfect for storing important documents, images, or any files alongside your notes. Features include real-time file validation and upload progress indication.</em></p>
</div>

---

### 📋 View Notes
<div align="center">
  <img src="screenshots/View Notes.png" alt="View Notes" width="800"/>
  <p><em>Comprehensive notes dashboard displaying all your saved notes in an organized card layout. Each note card shows the title, description preview, creation date, and attached files. Users can quickly edit, delete, or view full details of any note. The interface supports sorting and provides quick action buttons for efficient note management.</em></p>
</div>

---

### 👤 Profile Page
<div align="center">
  <img src="screenshots/Profile Page.png" alt="Profile Page" width="800"/>
  <p><em>User profile management interface showing personal information including full name, email, address, mobile number, and account role. Users can view their profile details and manage account settings. The profile page provides a centralized location for all user-related information and account management features.</em></p>
</div>

---

### ℹ️ About Page
<div align="center">
  <img src="screenshots/About Page.png" alt="About Page" width="800"/>
  <p><em>Learn more about the E-Notes application, its features, and purpose. This page provides detailed information about the platform's capabilities, technology stack, and how it helps users organize and manage their digital notes efficiently. Includes the mission statement and key benefits of using E-Notes.</em></p>
</div>
