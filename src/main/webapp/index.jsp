<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Web Talks</title>
    <style>
        /* General styles */
        body {
            font-family: sans-serif;
            margin: 0;
            padding: 0;
        }

        .head {
            border-bottom: 9px solid black;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 20px;
        }

        h1, h2, h3 {
            margin: 0;
            padding: 0;
        }

        a {
            text-decoration: none;
        }

        /* Header styles */
        header {
            background-color: #1abc9c;
            color: #fff;
            padding: 20px 0;
            display: flex;
            align-items: center;
        }

        header nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
        }

        header nav li {
            margin-right: 30px;
        }

        header nav a {
            color: #fff;
            font-weight: bold;
            text-transform: uppercase;
        }

        .event-info {
            margin-left: auto;
            text-align: right;
        }

        .event-info h1 {
            font-size: 48px;
            margin-bottom: 10px;
        }

        .event-info p {
            font-size: 18px;
        }

        /* Hero styles */
        .hero {
            background-color: #e74c3c;
            color: #fff;
            padding: 80px 0;
            text-align: center;
        }

        .hero h1 {
            font-size: 64px;
            margin-bottom: 20px;
        }

        /* Speakers styles */
        .speakers {
            background-color: #f1c40f;
            padding: 80px 0;
        }

        .speakers .container {
            display: flex;
            justify-content: space-between;
            width: 100%;
        }

        .speaker {
            text-align: center;
            width: 26%;
        }

        .speaker img {
            /*border-radius: 50%;*/
            margin-bottom: 20px;
        }

        /* Workshops styles */
        .workshops {
            background-color: #fff;
            padding: 80px 0;
        }

        .workshops .container {
            display: flex;
        }

        .workshop {
            width: 50%;
            padding-right: 50px;
        }

        .workshop img {
            width: 100%;
        }

        .workshop-details {
            width: 50%;
        }

        .workshop-item {
            margin-bottom: 50px;
        }

        /* Partners styles */
        .partners {
            background-color: #3498db;
            color: #fff;
            padding: 80px 0;
        }

        .partners .container {
            display: flex;
            justify-content: space-between;
        }

        .partners-list {
            width: 40%;
            text-align: center;
        }

        .partners-list img {
            margin-bottom: 20px;
        }

        .quote {
            width: 50%;
        }

        blockquote {
            font-size: 24px;
            margin: 0;
            padding: 0;
            margin-bottom: 30px;
        }

        /* Footer styles */
        footer {
            background-color: #34495e;
            color: #fff;
            padding: 20px 0;
            text-align: center;
        }

        footer nav ul {
            list-style: none;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
        }

        footer nav li {
            margin: 0 10px;
        }

        footer nav a {
            color: #fff;
        }

        .social {
            margin-top: 20px;
        }

        .social a {
            margin: 0 10px;
        }

        /* Button styles */
        .btn {
            background-color: #c0392b;
            color: #fff;
            padding: 15px 30px;
            border-radius: 5px;
            display: inline-block;
            margin-top: 20px;
            transition: background-color 0.3s ease;
        }

        .btn:hover {
            background-color: #e74c3c;
        }

        .archive {
            position: absolute;
            top: 20px;
            right: 20px;
            background-color: #2ecc71;
            color: #fff;
            padding: 10px 20px;
            border-radius: 5px;
            text-transform: uppercase;
            font-weight: bold;
        }
    </style>
</head>
<body>
<header class="head">
    <div class="container">
        <nav>
            <ul>
                <li><a href="#">HOME</a></li>
                <li><a href="#">SPEAKERS</a></li>
                <li><a href="#">SCHEDULE</a></li>
                <li><a href="#">SPONSORS</a></li>
            </ul>
        </nav>
<%--        <div class="event-info">--%>
<%--            <h1>2019</h1>--%>
<%--            <p>AUG 10-12</p>--%>
<%--            <h2>TORONTO<br>CANADA</h2>--%>
<%--        </div>--%>
<%--        <a href="#" class="btn">BUY TICKETS</a>--%>
<%--        <a href="#" class="archive">ARCHIVE</a>--%>
    </div>
</header>
<main>
    <section class="hero">
        <div class="hero1">
            <h1>WEB<br>TALKS</h1>

        </div>
        <div class="hero2">
            <h2>World-class Speakers</h2>
            <p>Ut aliquet mauris vitae ante maximus, non rutrum eros aliquet. Duis mattis odio in turpis ullamcorper ornare eget in est.</p>
        </div>
    </section>
    <section class="speakers">
        <div class="container">
            <div class="speaker">
                <img src="https://i.pinimg.com/564x/71/a2/ad/71a2ad52a17abb3ade372394eca9e025.jpg" alt="Gillian Radford">
                <h3>Gillian Radford</h3>
                <p>RADFORD & ONEAL</p>
            </div>
            <div class="speaker">
                <img src="https://i.pinimg.com/564x/bc/cd/6f/bccd6f213051d2f19d7c9d49a7edef25.jpg" alt="Morty Kingsley">
                <h3>Morty Kingsley</h3>
                <p>KINGSLEY INC.</p>
            </div>
            <div class="speaker">
                <img src="https://i.pinimg.com/564x/09/9f/cf/099fcff8b39b0a4e3ca7d5aca28be527.jpg" alt="Christine Kort">
                <h3>Christine Kort</h3>
                <p>KORT & KORT</p>
            </div>
        </div>
        <a href="#" class="btn">SEE ALL 20 SPEAKERS</a>
    </section>
    <section class="workshops">
        <div class="container">
            <div class="workshop">
                <img src="workshop.png" alt="Workshop">
            </div>
            <div class="workshop-details">
                <h2>Hands-on Workshops</h2>
                <div class="workshop-item">
                    <h3>01. Making fun products</h3>
                    <p>By Wendy Wiese</p>
                    <p>Curabitur odio turpis, laoreet lobortis mauris ut, blandit. Mauris at est ac urna consectetur sed nec elit placerat magna quis velit aliquet. Mauris tincidunt felis.</p>
                    <a href="#" class="btn">BOOK WORKSHOP</a>
                </div>
                <div class="workshop-item">
                    <h3>02. Creating real fakes</h3>
                    <p>By Mike Mirts</p>
                </div>
                <div class="workshop-item">
                    <h3>03. Why design matters</h3>
                    <p>By William J. Padilla</p>
                </div>
            </div>
        </div>
    </section>
    <section class="partners">
        <div class="container">
            <div class="partners-list">
                <h2>Our Partners</h2>
                <img src="partners.png" alt="Partners">
                <h3>Hypocero</h3>
            </div>
            <div class="quote">
                <blockquote>"The best user experience assumes every interface is the one within reach."</blockquote>
                <p>- Mark J. Mills<br>Product Design Manager at Gotchalk</p>
                <a href="#" class="btn">2017 RECAP</a>
                <a href="#" class="btn">BUY TICKETS</a>
            </div>
        </div>
    </section>
</main>
<footer>
    <div class="container">
        <nav>
            <ul>
                <li><a href="#">HOME</a></li>
                <li><a href="#">SPEAKERS</a></li>
                <li><a href="#">SCHEDULE</a></li>
                <li><a href="#">SPONSORS</a></li>
            </ul>
        </nav>
        <div class="social">
            <a href="#"><img src="facebook.png" alt="Facebook"></a>
            <a href="#"><img src="twitter.png" alt="Twitter"></a>
            <a href="#"><img src="instagram.png" alt="Instagram"></a>
        </div>
    </div>
</footer>
</body>
</html>











<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Insurance</title>--%>
<%--    <style>--%>
<%--        * {--%>
<%--            margin: 0;--%>
<%--            padding: 0;--%>
<%--            box-sizing: border-box;--%>
<%--        }--%>

<%--        .wrapper,--%>
<%--        .content {--%>
<%--            position: relative;--%>
<%--            width: 100%;--%>
<%--            z-index: 1;--%>
<%--        }--%>

<%--        .content {--%>
<%--            overflow-x: hidden;--%>
<%--        }--%>

<%--        .content .section {--%>
<%--            width: 100%;--%>
<%--            height: 100vh;--%>
<%--        }--%>

<%--        .content .section.hero {--%>
<%--            /*background-image: url(https://images.unsplash.com/photo-1589848315097-ba7b903cc1cc?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D);*/--%>
<%--            background-image: url("https://images.unsplash.com/photo-1707999494558-14354a63f6d9?q=80&w=1931&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D");--%>
<%--            background-position: center center;--%>
<%--            background-repeat: no-repeat;--%>
<%--            background-size: cover;--%>
<%--        }--%>

<%--        .image-container {--%>
<%--            width: 100%;--%>
<%--            height: 100vh;--%>
<%--            position: absolute;--%>
<%--            top: 0;--%>
<%--            left: 0;--%>
<%--            right: 0;--%>
<%--            z-index: 2;--%>
<%--            perspective: 500px;--%>
<%--            overflow: hidden;--%>
<%--        }--%>

<%--        .image-container img {--%>
<%--            width: 100%;--%>
<%--            height: 100%;--%>
<%--            object-fit: cover;--%>
<%--            object-position: center center;--%>
<%--        }--%>

<%--    </style>--%>
<%--</head>--%>
<%--<body>--%>

<%--<div class="wrapper">--%>
<%--    <div class="content">--%>
<%--        <section class="section hero"></section>--%>
<%--        <section class="section gradient-purple"></section>--%>
<%--        <section class="section gradient-blue"></section>--%>
<%--    </div>--%>
<%--    <div class="image-container">--%>
<%--        <img src="https://assets-global.website-files.com/63ec206c5542613e2e5aa784/643312a6bc4ac122fc4e3afa_main%20home.webp" alt="image">--%>
<%--&lt;%&ndash;        <img src="https://img.freepik.com/free-vector/flat-comic-style-wallpaper_23-2148818812.jpg?t=st=1729606638~exp=1729610238~hmac=76346cb813a08d30aa5af46e0eb2c5206e269add4d2cd93cb7e768f8eac1f82e&w=1380"/>&ndash;%&gt;--%>
<%--    </div>--%>
<%--</div>--%>

<%--</body>--%>
<%--<script src="https://unpkg.com/gsap@3/dist/gsap.min.js"></script>--%>
<%--<script src="https://unpkg.com/gsap@3/dist/ScrollTrigger.min.js"></script>--%>
<%--<script>--%>
<%--    console.clear();--%>

<%--    gsap.registerPlugin(ScrollTrigger);--%>

<%--    window.addEventListener("load", () => {--%>
<%--        gsap--%>
<%--            .timeline({--%>
<%--                scrollTrigger: {--%>
<%--                    trigger: ".wrapper",--%>
<%--                    start: "top top",--%>
<%--                    end: "+=150%",--%>
<%--                    pin: true,--%>
<%--                    scrub: true,--%>
<%--                    markers: true--%>
<%--                }--%>
<%--            })--%>
<%--            .to("img", {--%>
<%--                scale: 2,--%>
<%--                z: 350,--%>
<%--                transformOrigin: "center center",--%>
<%--                ease: "power1.inOut"--%>
<%--            })--%>
<%--            .to(--%>
<%--                ".section.hero",--%>
<%--                {--%>
<%--                    scale: 1.1,--%>
<%--                    transformOrigin: "center center",--%>
<%--                    ease: "power1.inOut"--%>
<%--                },--%>
<%--                "<"--%>
<%--            );--%>
<%--    });--%>

<%--</script>--%>
<%--</html>--%>