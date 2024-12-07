<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot</title>
    <style>
        body {
            margin: 0;
            font-family: 'Arial', sans-serif;
            background-color: #f0f0f0;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-top: 30px;
            font-size: 28px;
        }

        .navbar {
            display: flex;
            justify-content: center;
            background-color: #333;
            padding: 15px 0;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            position: sticky;
            top: 0;
            z-index: 1000;
        }

        .navbar a {
            color: white;
            padding: 15px 25px;
            text-decoration: none;
            font-size: 16px;
            font-weight: 500;
            text-transform: uppercase;
            letter-spacing: 1px;
            transition: 0.4s ease-in-out;
            position: relative;
        }

        .navbar a::before {
            content: '';
            position: absolute;
            width: 100%;
            height: 3px;
            background-color: #007BFF;
            bottom: 0;
            left: 0;
            transform: scaleX(0);
            transform-origin: right;
            transition: transform 0.4s ease-in-out;
        }

        .navbar a:hover::before {
            transform: scaleX(1);
            transform-origin: left;
        }

        .navbar a:hover {
            color: #007BFF;
        }

        .navbar a.active {
            color: #007BFF;
        }

    </style>
</head>
<body>
    <h2>END SEM LAB</h2>
    <div class="navbar">
        <a href="/">Home</a>
        <a href="empreg">Customer Registration</a>
               <a href="viewallemps">View All Customers</a>
       
       
    </div>
</body>
</html>
