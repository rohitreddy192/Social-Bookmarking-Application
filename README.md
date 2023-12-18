# Social Bookmarking Application

This project is a Social Bookmarking application built using Core Java, emphasizing and demonstrating the Model-View-Controller (MVC) architecture.

## Overview

The Social Bookmarking Application allows users to:

- **Create** and **manage** bookmarks for their favorite websites.
- **Categorize** bookmarks for better organization.
- **View** and **edit** existing bookmarks.
- **Edit** bookmarks based on admin profiles.
- **Search** for bookmarks by keywords or categories.

## Features

- **MVC Architecture**: The application follows the Model-View-Controller pattern for clear separation of concerns:
    - **Model**: Represents the data and business logic. Includes entities like Bookmark, User, etc.
    - **View**: Handles the presentation layer. In this application, views are implemented as UI components.
    - **Controller**: Controls the flow of data between the Model and View. Manages user inputs and interactions.
- **DAO Classes (Data Access Objects)**: Responsible for interacting with the database or data storage. These classes handle CRUD operations for entities like Bookmark, User, etc.
- **Manager Classes**: Act as an intermediary between controllers and DAOs. They encapsulate business logic and coordinate multiple DAO operations for a specific use case.
- **Controllers**: Handle user inputs, interact with Manager classes, and update the View accordingly.
- **Pure Core Java**: Built entirely using core Java without any external frameworks or libraries.

## MVC Flow in the Application

1. **View Interaction**:
    - Users interact with the View (UI) to perform actions like adding bookmarks, editing categories, etc.
    - The View triggers events that are captured by corresponding Controller methods.
    - In our application, The Launch is the main Java class where the view is displayed to the end user, which indeed invokes the View class that has the User Bookmarking functionality and Mark Kid Friendly Functionality(only for the approved users) displayed to the User.

2. **Controller Handling**:
    - Controllers receive user inputs and delegate requests to appropriate Manager classes based on the action.
    - For instance, creating a bookmark triggers the BookmarkController, which communicates with the BookmarkManager.

3. **Manager Operations**:
    - Manager classes orchestrate business logic, utilizing DAO classes to interact with the database.
    - BookmarkManager might coordinate multiple BookmarkDAO methods to add bookmarks.
    - UserManager interact with UserDAO to add Users.
    - These two in combination will add a User Bookmark to the Data Store.

4. **Model**:
    - The changes in the Model (bookmark creation, deletion, etc.) are reflected in the underlying data managed by DAO classes.
    - Entities:-
        1. User Entity,
        2. Bookmark Entity,
        3. Movie Entity,
        4. WebLink Entity,
        5. Book Entity,
        6. UserBookmark Entity
    - These Entities are the structure of the Tables in the Data Store which are created using DAO classes.


## Installation

To run the Social Bookmarking Application locally:

1. Clone the repository:

    ```bash
    git clone https://github.com/rohitreddy192/Social-Bookmarking-Application.git
    ```

2. Compile and run the main Java file:

    ```bash
    javac Launch.java
    java Launch
    ```

