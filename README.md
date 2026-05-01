# ProPair

ProPair is a Kotlin-based Android application that connects **customers** with **service providers** through a simple two-sided marketplace experience. Customers can discover providers, create bookings, communicate, and complete payments, while providers can review incoming job requests, accept jobs, manage their services, and message customers—all from within the app.

## What this project does (Purpose)
ProPair’s goal is to streamline the end-to-end workflow of finding a service, booking it, and managing the job lifecycle with clear, role-based screens for **Customers** and **Providers**.

## Key Features
### Customer Experience
- Onboarding + Welcome flow
- Login and multi-step Signup
- Home and Service Search
- Booking flow (confirmation steps + booking details)
- View bookings and status
- In-app messaging
- Profile management
- Payments (Cash / Card) + Payment success flow

### Provider Experience
- Provider home dashboard
- View **New Jobs** and **Accepted Jobs**
- Manage services
- In-app messaging
- Profile management

## Tech Stack
- **Language:** Kotlin
- **Platform:** Android
- **UI:** Material Components, ConstraintLayout, RecyclerView
- **AndroidX:** Core KTX, AppCompat, Activity
- **Architecture / Productivity:** View Binding
- **Maps:** Google Play Services Maps

## Project Notes
- This repository contains an Android app module (`app/`) with multiple activities representing onboarding, authentication, customer/provider flows, bookings, messaging, and payments.
