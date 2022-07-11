-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-07-2022 a las 07:08:44
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemadeventas1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `Código` int(1) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Nit` int(20) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Género` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`Código`, `Nombre`, `Nit`, `Correo`, `Género`) VALUES
(1, 'Abramo', 100001, 'adahill0@mail.ru', 'm'),
(2, 'Paxon', 100002, 'pgambrell1@walmart.com', 'f'),
(3, 'Codi', 100003, 'cjervois2@joomla.org', 'm'),
(4, 'Margaretha', 100004, 'mfawdrey3@indiegogo.com', 'f'),
(5, 'Jamie', 100005, 'jbrosi4@redcross.org', 'f'),
(6, 'Giles', 100006, 'gcraydon5@surveymonkey.com', 'm'),
(7, 'Joye', 100007, 'jgrange6@disqus.com', 'm'),
(8, 'Amos', 100008, 'arulf7@ow.ly', 'f'),
(9, 'Karney', 100009, 'kfilyukov8@elpais.com', 'm'),
(10, 'Tasia', 100010, 'tmiklem9@seattletimes.com', 'f'),
(11, 'Adham', 100011, 'afoyea@a8.net', 'm'),
(12, 'Stephannie', 100012, 'sdrinnanb@reuters.com', 'm'),
(13, 'Steve', 100013, 'sstillyc@auda.org.au', 'f'),
(14, 'Anabel', 100014, 'ashoweringd@list-manage.com', 'f'),
(15, 'Mignon', 100015, 'mpatmoree@prnewswire.com', 'm'),
(16, 'Madelena', 100016, 'mtimmisf@stanford.edu', 'f'),
(17, 'Guillermo', 100017, 'gpondg@blogspot.com', 'f'),
(18, 'Marijo', 100018, 'mvardieh@dailymotion.com', 'm'),
(19, 'Zora', 100019, 'zbinesteadi@hhs.gov', 'm'),
(20, 'Tamra', 100020, 'tcotterellj@abc.net.au', 'f'),
(21, 'Helen', 100021, 'hsedenk@engadget.com', 'm'),
(22, 'Goldy', 100022, 'gbettlesonl@about.me', 'f'),
(23, 'Leila', 100023, 'ledworthyem@hibu.com', 'm'),
(24, 'Allx', 100024, 'abaudoun@aol.com', 'm'),
(25, 'Everett', 100025, 'ekunzeo@nba.com', 'f'),
(26, 'Ruthi', 100026, 'rsumblerp@shareasale.com', 'm'),
(27, 'Karlens', 100027, 'kdenizetq@loc.gov', 'm'),
(28, 'Rachel', 100028, 'rfurlowr@examiner.com', 'm'),
(29, 'Junia', 100029, 'jgrovess@va.gov', 'm'),
(30, 'Caprice', 100030, 'cthoulesst@bloglines.com', 'm'),
(31, 'Kass', 100031, 'klambdeanu@dion.ne.jp', 'm'),
(32, 'Cleveland', 100032, 'cscreechv@tinyurl.com', 'f'),
(33, 'Ludwig', 100033, 'lirnysw@unicef.org', 'f'),
(34, 'Remy', 100034, 'rbauducciox@geocities.jp', 'm'),
(35, 'Kathi', 100035, 'ksnelley@google.it', 'm'),
(36, 'Erny', 100036, 'efassumz@cisco.com', 'm'),
(37, 'Barry', 100037, 'bpenberthy10@nsw.gov.au', 'm'),
(38, 'Ryan', 100038, 'rbrunone11@harvard.edu', 'm'),
(39, 'Korie', 100039, 'klies12@t.co', 'f'),
(40, 'Darbie', 100040, 'ddibartolomeo13@bloglines.com', 'm'),
(41, 'Galen', 100041, 'gfranciskiewicz14@myspace.com', 'm'),
(42, 'Obidiah', 100042, 'ocurtiss15@usa.gov', 'm'),
(43, 'Errol', 100043, 'emessam16@cdbaby.com', 'm'),
(44, 'Demetris', 100044, 'ddeal17@vistaprint.com', 'm'),
(45, 'Ahmad', 100045, 'aitzig18@mapquest.com', 'm'),
(46, 'Rodrique', 100046, 'rhawksby19@odnoklassniki.ru', 'm'),
(47, 'Woodie', 100047, 'wpotapczuk1a@blinklist.com', 'f'),
(48, 'Kattie', 100048, 'krunnalls1b@unblog.fr', 'm'),
(49, 'Breena', 100049, 'bmiltonwhite1c@seattletimes.com', 'm'),
(50, 'Jere', 100050, 'jseamon1d@slideshare.net', 'f'),
(51, 'Eveline', 100051, 'eomarkey1e@ask.com', 'f'),
(52, 'Klarika', 100052, 'kcrigin1f@indiatimes.com', 'm'),
(53, 'Mohandas', 100053, 'murch1g@tuttocitta.it', 'm'),
(54, 'Lorettalorna', 100054, 'lboarder1h@irs.gov', 'f'),
(55, 'Deana', 100055, 'dpengelly1i@seesaa.net', 'f'),
(56, 'Spencer', 100056, 'shouseman1j@dell.com', 'm'),
(57, 'Edlin', 100057, 'ecrofthwaite1k@google.co.uk', 'f'),
(58, 'Tanya', 100058, 'tbester1l@sakura.ne.jp', 'm'),
(59, 'Pattin', 100059, 'pkeson1m@ycombinator.com', 'm'),
(60, 'Ciro', 100060, 'clitt1n@elegantthemes.com', 'm'),
(61, 'Rafe', 100061, 'rkolis1o@time.com', 'm'),
(62, 'Skippie', 100062, 'ssteptow1p@pcworld.com', 'f'),
(63, 'Berget', 100063, 'bettery1q@scribd.com', 'f'),
(64, 'Hanson', 100064, 'helmes1r@google.it', 'm'),
(65, 'Laurel', 100065, 'lunderdown1s@jiathis.com', 'f'),
(66, 'Ogdan', 100066, 'ofeitosa1t@elpais.com', 'f'),
(67, 'Bay', 100067, 'bhellwing1u@xing.com', 'f'),
(68, 'Minette', 100068, 'mfrancom1v@columbia.edu', 'm'),
(69, 'Blythe', 100069, 'bjahn1w@t.co', 'm'),
(70, 'Nance', 100070, 'nkobelt1x@nifty.com', 'f'),
(71, 'Wade', 100071, 'wshoulders1y@tinypic.com', 'm'),
(72, 'Valaria', 100072, 'vthomazet1z@telegraph.co.uk', 'm'),
(73, 'Consolata', 100073, 'cladel20@time.com', 'f'),
(74, 'Angelica', 100074, 'aigo21@hp.com', 'f'),
(75, 'Bernete', 100075, 'bfleetwood22@walmart.com', 'f');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `Código` int(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Descripción` varchar(250) NOT NULL,
  `Cantidad` int(50) NOT NULL,
  `Precio` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`Código`, `Nombre`, `Descripción`, `Cantidad`, `Precio`) VALUES
(1, 'Energy Drink', 'Cremin and Sons', 36, 291),
(2, 'Oil - Grapeseed Oil', 'Bednar, King and Kilback', 94, 698),
(3, 'Tuna - Salad Premix', 'Green and Sons', 44, 693),
(4, 'Pails With Lids', 'Jakubowski-Kling', 37, 906),
(5, 'Sparkling Wine - Rose, Freixenet', 'Schowalter-Morissette', 46, 443),
(6, 'Milk - Skim', 'Graham, Miller and Weissnat', 100, 260),
(7, 'Herb Du Provence - Primerba', 'Emard, Haag and Larkin', 39, 100),
(8, 'Cookies - Englishbay Wht', 'Keebler, Bogisich and Mann', 56, 622),
(9, 'Coffee Cup 8oz 5338cd', 'Simonis-Mohr', 2, 777),
(10, 'Lettuce - Boston Bib', 'Cremin-Hintz', 11, 987),
(11, 'Noodles - Cellophane, Thin', 'Skiles, Block and Konopelski', 66, 571),
(12, 'Mushroom - King Eryingii', 'Kilback, Goyette and Padberg', 64, 6),
(13, 'Tortillas - Flour, 8', 'Mohr and Sons', 38, 775),
(14, 'Chevere Logs', 'Macejkovic, Heathcote and Keeling', 37, 402),
(15, 'Tea - Decaf Lipton', 'Ledner-Abshire', 2, 364),
(16, 'Lettuce - Iceberg', 'Osinski-Runolfsdottir', 9, 83),
(17, 'Chips Potato Salt Vinegar 43g', 'Mueller, Moen and Kirlin', 41, 979),
(18, 'Mushroom - Oyster, Fresh', 'Hudson-Beahan', 44, 962),
(19, 'Peas - Pigeon, Dry', 'Jakubowski, Morissette and Kulas', 35, 878),
(20, 'Gatorade - Xfactor Berry', 'Kassulke-Hand', 79, 840),
(21, 'Smoked Tongue', 'Haley LLC', 30, 667),
(22, 'Carrots - Mini, Stem On', 'Gislason, Runolfsson and Murazik', 35, 193),
(23, 'Cake - Pancake', 'Barrows Inc', 53, 501),
(24, 'Sauce - Vodka Blush', 'Torp, Howe and Daniel', 30, 382),
(25, 'Rice - Wild', 'Grant-Leffler', 13, 970),
(26, 'Rolled Oats', 'Ward and Sons', 26, 348),
(27, 'Miso - Soy Bean Paste', 'Leffler Inc', 28, 527),
(28, 'Parsley Italian - Fresh', 'McCullough-Trantow', 86, 950),
(29, 'Carroway Seed', 'Cummerata and Sons', 32, 993),
(30, 'Beef - Bresaola', 'Jones LLC', 79, 789),
(31, 'Sausage - Blood Pudding', 'Bailey, Powlowski and Hermiston', 53, 288),
(32, 'Sausage - Blood Pudding', 'Morissette and Sons', 27, 905),
(33, 'Appetizer - Mango Chevre', 'Bruen LLC', 73, 859),
(34, 'Squeeze Bottle', 'Barton and Sons', 27, 692),
(35, 'Ham - Virginia', 'Schowalter-Anderson', 62, 393),
(36, 'Wine - Riesling Dr. Pauly', 'Wyman-Ritchie', 40, 634),
(37, 'Pastrami', 'Kutch, Roberts and Koelpin', 92, 145),
(38, 'Mince Meat - Filling', 'Crooks-Olson', 75, 598),
(39, 'Mushroom - Crimini', 'Lockman, Hansen and Maggio', 20, 973),
(40, 'Cookie Double Choco', 'Ryan LLC', 93, 130),
(41, 'Pear - Packum', 'Ledner Inc', 2, 540),
(42, 'Peach - Halves', 'VonRueden, Langworth and Ebert', 42, 604),
(43, 'Radish - Black, Winter, Organic', 'Stiedemann, Jerde and Kilback', 45, 88),
(44, 'Beets - Candy Cane, Organic', 'Walsh-Walter', 13, 314),
(45, 'Juice - Propel Sport', 'Jast-Bogan', 2, 862),
(46, 'Island Oasis - Banana Daiquiri', 'Kessler Inc', 33, 491),
(47, 'Bread - White, Unsliced', 'Morar, Leuschke and Lehner', 77, 931),
(48, 'Wine - Pinot Noir Stoneleigh', 'Keebler Inc', 83, 635),
(49, 'Cake - Dulce De Leche', 'Daniel-Glover', 15, 348),
(50, 'Bay Leaf Fresh', 'Koelpin Group', 19, 393),
(51, 'Beer - Camerons Auburn', 'Osinski Group', 23, 680),
(52, 'Potatoes - Yukon Gold, 80 Ct', 'Will-Hackett', 78, 645),
(53, 'Soap - Hand Soap', 'Rempel-Romaguera', 10, 569),
(54, 'Broom - Angled', 'Johnston, Gleason and Beatty', 82, 562),
(55, 'Milk - Chocolate 500ml', 'Hayes-Harvey', 62, 264),
(56, 'Chickhen - Chicken Phyllo', 'Bayer-Nolan', 95, 653),
(57, 'Ecolab - Solid Fusion', 'Durgan, Welch and Leffler', 75, 941),
(58, 'Relish', 'Hegmann, Rau and Thiel', 73, 173),
(59, 'Beef Striploin Aaa', 'Maggio-Schiller', 50, 157),
(60, 'Chicken - Livers', 'Hoppe-Mann', 12, 750),
(61, 'Pepsi - Diet, 355 Ml', 'O\'Conner and Sons', 39, 278),
(62, 'Yoplait Drink', 'Heidenreich, Braun and Kiehn', 24, 685),
(63, 'Table Cloth 81x81 Colour', 'Huel and Sons', 37, 902),
(64, 'Bandage - Fexible 1x3', 'Kihn Group', 17, 970),
(65, 'Egg - Salad Premix', 'Anderson, Spencer and Legros', 30, 521),
(66, 'Garbage Bag - Clear', 'Bergstrom, Witting and Lubowitz', 82, 586),
(67, 'Bread - Dark Rye', 'VonRueden Inc', 34, 576),
(68, 'Wine - Rosso Del Veronese Igt', 'Mohr-McDermott', 20, 600),
(69, 'Pheasants - Whole', 'Waters Inc', 4, 117),
(70, 'Cookie Dough - Chunky', 'Ondricka, Hauck and Runolfsdottir', 38, 666),
(71, 'Soup Campbells Split Pea And Ham', 'Heidenreich Inc', 83, 811),
(72, 'Coconut - Creamed, Pure', 'Huel and Sons', 11, 34),
(73, 'Pastry - Chocolate Chip Muffin', 'Schuster-Runte', 39, 211),
(74, 'Bagel - Everything', 'Tremblay, Goldner and Gislason', 77, 945),
(75, 'Potatoes - Yukon Gold, 80 Ct', 'Rogahn and Sons', 6, 399),
(76, 'Stainless Steel Cleaner Vision', 'Russel, Ruecker and Stehr', 82, 695),
(77, 'Squash - Pepper', 'Osinski and Sons', 20, 397),
(78, 'Pork - Back Ribs', 'Kertzmann, Abshire and Terry', 98, 343),
(79, 'Wine - White, Riesling, Henry Of', 'Schuster-Dach', 5, 763),
(80, 'Barramundi', 'Hodkiewicz Group', 57, 332),
(81, 'Sesame Seed', 'Sauer, Murray and Haag', 64, 820),
(82, 'Vol Au Vents', 'Sanford and Sons', 66, 552),
(83, 'Sauce - Thousand Island', 'Runte Inc', 49, 282),
(84, 'Sambuca - Opal Nera', 'Reinger LLC', 56, 951),
(85, 'Soup Campbells Split Pea And Ham', 'Ondricka-Johns', 37, 196),
(86, 'Lettuce - Lolla Rosa', 'Moore, Kshlerin and Hand', 26, 811),
(87, 'Extract - Lemon', 'Lynch, Douglas and Dickens', 95, 981),
(88, 'Bread - Sour Batard', 'Cartwright-Jacobson', 86, 582),
(89, 'Juice - Grapefruit, 341 Ml', 'Grant, Hermiston and Kohler', 11, 542),
(90, 'Shrimp - Black Tiger 16/20', 'Brown, Gerhold and Stracke', 53, 668),
(91, 'Table Cloth 81x81 White', 'Murray-Homenick', 58, 191),
(92, 'Chocolate - Dark Callets', 'Skiles-Lang', 71, 208),
(93, 'Garlic Powder', 'Hills-Morar', 12, 897),
(94, 'C - Plus, Orange', 'Runolfsdottir LLC', 91, 52),
(95, 'Sproutsmustard Cress', 'Kohler, Mitchell and Stiedemann', 1, 625),
(96, 'Bread - Sour Sticks With Onion', 'Klocko and Sons', 96, 157),
(97, 'Chocolate - Unsweetened', 'Klein-Kuvalis', 90, 539),
(98, 'Tomatoes - Roma', 'Parisian-Bauch', 24, 532),
(99, 'Crab Brie In Phyllo', 'Auer Inc', 68, 180),
(100, 'Chocolate Liqueur - Godet White', 'Beier-Kautzer', 13, 445),
(101, 'Veal Inside - Provimi', 'VonRueden-Zulauf', 27, 537),
(102, 'Muffin - Mix - Strawberry Rhubarb', 'Luettgen-Beer', 55, 167),
(103, 'Pork - Butt, Boneless', 'Bruen-Friesen', 82, 573),
(104, 'Mushroom - Shitake, Dry', 'Bartoletti Group', 19, 198),
(105, 'Tomatillo', 'Batz Inc', 15, 597),
(106, 'Crab Meat Claw Pasteurise', 'Olson-Cruickshank', 62, 972),
(107, 'Soup - French Can Pea', 'Witting Inc', 14, 96),
(108, 'Shichimi Togarashi Peppeers', 'Dietrich-Lang', 24, 795),
(109, 'Halibut - Whole, Fresh', 'Gottlieb-Friesen', 4, 167),
(110, 'Apricots Fresh', 'Tremblay, Halvorson and Reinger', 77, 974),
(111, 'Cake - Box Window 10x10x2.5', 'Koss-Littel', 1, 777),
(112, 'Russian Prince', 'Bernhard, Skiles and Green', 55, 211),
(113, 'Appetizer - Sausage Rolls', 'Considine LLC', 30, 35),
(114, 'Mushroom - Chanterelle, Dry', 'Marquardt and Sons', 90, 786),
(115, 'Vacuum Bags 12x16', 'Smitham-Quitzon', 32, 342),
(116, 'Wine - Maipo Valle Cabernet', 'Kihn, Cartwright and Cummings', 44, 861),
(117, 'Dc - Sakura Fu', 'Nikolaus-Moore', 16, 863),
(118, 'Chicken - Base, Ultimate', 'Rolfson and Sons', 38, 873),
(119, 'Lid - Translucent, 3.5 And 6 Oz', 'Hammes-Olson', 99, 370),
(120, '7up Diet, 355 Ml', 'Jones, Abbott and Hirthe', 91, 53),
(121, 'Coffee - Cafe Moreno', 'Spencer, Cruickshank and Kihn', 68, 796),
(122, 'Tea - Orange Pekoe', 'Treutel, Connelly and Gibson', 10, 530),
(123, 'Turkey - Oven Roast Breast', 'Mraz, Herman and Bogisich', 83, 834),
(124, 'Pecan Raisin - Tarts', 'Brakus-Kassulke', 75, 108),
(125, 'Beef - Shank', 'Cummerata-Wiegand', 83, 90),
(126, 'Oil - Olive Bertolli', 'Smitham-Torphy', 20, 139),
(127, 'Bagelers - Cinn / Brown', 'Douglas Inc', 37, 379),
(128, 'Taro Root', 'Gutkowski, Nicolas and Bahringer', 74, 393),
(129, 'Ecolab - Hobart Washarm End Cap', 'Bayer, Johns and Breitenberg', 52, 273),
(130, 'Calvados - Boulard', 'Deckow and Sons', 32, 794),
(131, 'Cut Wakame - Hanawakaba', 'Auer LLC', 87, 221),
(132, 'Mushroom - Trumpet, Dry', 'Hegmann-Baumbach', 41, 483),
(133, 'Cookies - Assorted', 'Macejkovic, Pouros and Kuhn', 11, 978),
(134, 'Jolt Cola - Red Eye', 'Shields LLC', 97, 576),
(135, 'Marsala - Sperone, Fine, D.o.c.', 'Hoeger and Sons', 13, 315),
(136, 'Mikes Hard Lemonade', 'Nienow LLC', 47, 368),
(137, 'Bandage - Flexible Neon', 'Jast-Barton', 58, 485),
(138, 'Longos - Assorted Sandwich', 'Runte-Erdman', 13, 758),
(139, 'Tomatoes - Yellow Hot House', 'Herman Inc', 19, 554),
(140, 'Huck White Towels', 'Gutmann-Lebsack', 20, 216),
(141, 'Tart - Lemon', 'Yundt-VonRueden', 12, 439),
(142, 'Cheese - Parmesan Grated', 'Kshlerin-Kunze', 26, 305),
(143, 'Shiratamako - Rice Flour', 'Bailey Inc', 24, 46),
(144, 'Wheat - Soft Kernal Of Wheat', 'Durgan-Ritchie', 76, 279),
(145, 'Beef - Bones, Marrow', 'Rolfson LLC', 89, 895),
(146, 'Coriander - Seed', 'Schmitt, Ritchie and Ortiz', 74, 751),
(147, 'Tea - Mint', 'Stehr and Sons', 69, 704),
(148, 'Lid Tray - 12in Dome', 'Stark, Padberg and Pouros', 71, 333),
(149, 'Beef - Flank Steak', 'Balistreri-Ryan', 55, 624),
(150, 'Cheese - La Sauvagine', 'Weissnat, Nicolas and Parker', 20, 872);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursales`
--

CREATE TABLE `sucursales` (
  `Código` int(20) NOT NULL,
  `Nombre` varchar(250) NOT NULL,
  `Dirección` varchar(60) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Télefono` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sucursales`
--

INSERT INTO `sucursales` (`Código`, `Nombre`, `Dirección`, `Correo`, `Télefono`) VALUES
(2, 'Juan', 'Mexico', 'juan@gmail.com', 2456609),
(3, 'Douglas-Larson', '044 Independence Alley', 'rmadge1@newyorker.com', 2456609),
(4, 'Metz-Reinger', '279 Larry Lane', 'jitskovitz2@friendfeed.com', 2495630),
(5, 'Kreiger and Sons', '8 Novick Lane', 'eboraston3@apache.org', 2400192),
(6, 'Jaskolski Inc', '333 Bartelt Circle', 'rheinreich4@nsw.gov.au', 2495829),
(7, 'Dickinson-Schoen', '34 Delaware Way', 'afuster5@unblog.fr', 2402859),
(8, 'Hermiston-Brekke', '47391 Rowland Road', 'bsegot6@abc.net.au', 2415390),
(9, 'Schamberger, Shields and Corwin', '9552 Sommers Point', 'ehartburn7@about.me', 2433697),
(10, 'Harvey Group', '3730 Sundown Plaza', 'ctrees8@fema.gov', 2442938),
(11, 'Deckow-Walter', '62 Troy Street', 'jpim9@altervista.org', 2463599),
(12, 'Bednar and Sons', '07 Texas Pass', 'clevisa@linkedin.com', 2452281),
(13, 'McCullough Group', '898 Elka Center', 'dtronib@dailymail.co.uk', 2437791),
(14, 'Harris, McKenzie and Hintz', '66403 Morningstar Hill', 'gfoldc@amazonaws.com', 2480766),
(15, 'Volkman-Kuphal', '29 Leroy Alley', 'wdayleyd@tinypic.com', 2467424),
(16, 'Rogahn, Bins and Wintheiser', '80988 Ridgeview Hill', 'fjanoute@ycombinator.com', 2414941),
(17, 'Collier-Kulas', '86 Heath Plaza', 'jyounglovef@nymag.com', 2446769),
(18, 'Johnston and Sons', '0261 Nancy Trail', 'pharlingg@tinypic.com', 2479013),
(19, 'Macejkovic-VonRueden', '09 Lillian Hill', 'mespinhah@jiathis.com', 2429016),
(20, 'Bailey Group', '3586 Amoth Crossing', 'wgerriti@bloomberg.com', 2495423),
(21, 'Shields-Dickens', '64597 Walton Center', 'lwishamj@google.com.au', 2480490),
(22, 'Mayer, Roob and Wiza', '0 Manitowish Way', 'pbernardeschik@dion.ne.jp', 2421944),
(23, 'O\'Reilly LLC', '516 Forest Dale Crossing', 'sbirkinshawl@geocities.jp', 2498929),
(24, 'Stokes-Aufderhar', '8370 Texas Hill', 'mpykem@clickbank.net', 2460801),
(25, 'Hettinger-Erdman', '400 Pankratz Circle', 'pciobutaron@virginia.edu', 2489219),
(26, 'Schinner and Sons', '6114 Marquette Trail', 'ciacoboo@studiopress.com', 2451359),
(27, 'Abshire and Sons', '76776 Service Avenue', 'hwillersonp@list-manage.com', 2471588),
(28, 'Kautzer, Parker and Parker', '3 Thompson Avenue', 'jbalsdoneq@cornell.edu', 2422883),
(29, 'Greenfelder-Gerhold', '63383 Stoughton Terrace', 'ialdenr@omniture.com', 2415828),
(30, 'Daniel Group', '792 Golf Court', 'sbailes@bloglovin.com', 2400128),
(31, 'Waelchi, Johnston and King', '07014 Pepper Wood Terrace', 'kroskellyt@icq.com', 2473716),
(32, 'Weimann-Gutmann', '4815 Florence Way', 'avinnicombeu@nps.gov', 2421796),
(33, 'Runte-Jacobs', '98 Oxford Pass', 'bdumbletonv@amazon.com', 2413952),
(34, 'Gutmann LLC', '71 Bultman Place', 'bsawneyw@mozilla.org', 2402369),
(35, 'Harris-Heaney', '6 Leroy Alley', 'eocarranx@facebook.com', 2464910),
(36, 'Dach LLC', '5736 Chive Lane', 'ccurtissy@google.de', 2477835),
(37, 'Bogisich, Torphy and Lakin', '37 Service Avenue', 'blauxmannz@prweb.com', 2472322),
(38, 'Kuhn, Douglas and Davis', '20 Lotheville Court', 'erenachowski10@networkadvertising.org', 2489525),
(39, 'Bechtelar Inc', '02429 Atwood Place', 'jkillock11@yandex.ru', 2417564),
(40, 'Thompson-Kemmer', '2226 Rigney Pass', 'ccruz12@bigcartel.com', 2457869),
(41, 'Reilly, Hansen and DuBuque', '6282 Swallow Parkway', 'goscollee13@xinhuanet.com', 2491745);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `Código` int(50) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Caja` int(3) NOT NULL,
  `Ventas` int(50) NOT NULL,
  `Género` varchar(2) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`Código`, `Nombre`, `Caja`, `Ventas`, `Género`, `Password`) VALUES
(1, 'Luigi', 102, 20, 'm', '12345'),
(2, 'Katrinka', 101, 0, 'm', 'af579a200b74797b3e78822bf28c2985'),
(3, 'Katleen', 102, 0, 'm', 'e3699d375ded04880e3166dc55f89fde'),
(4, 'Felizio', 103, 0, 'm', '379094cd2c69562f8b8305439b49a613'),
(5, 'Arnie', 104, 0, 'f', '808cb3e29688a78c56610d2a457e5ee4'),
(6, 'Edwin', 105, 0, 'f', '4a562ffc4813726d83d0acdd854fc87d'),
(7, 'Laurens', 106, 0, 'f', '1a7417ff18ee9bfe6f04233dd7ec6908'),
(8, 'Allianora', 107, 0, 'm', '3910f2c2fc6b5bce7ed4d739ae576928'),
(9, 'Johnnie', 108, 0, 'f', 'e1d6c5af6076cb6f1d21833b017f7acf'),
(10, 'Kala', 109, 0, 'm', '08621114b828e2910eb45cc0f1d5c11e'),
(11, 'Terrijo', 110, 0, 'm', '5713177c9d4678186b4f52fc58adfca7'),
(12, 'Broderick', 111, 0, 'f', 'f00c4e0dbd8e53f198d650fc877d51c5'),
(13, 'Junia', 112, 0, 'm', '8623116fdaf6cec4a6f34cfdf33e8875'),
(14, 'Myrah', 113, 0, 'm', 'e6ce0d8beebbcb4a35ceeb81d0fa993a'),
(15, 'Wendeline', 114, 0, 'm', 'bebbd8a4c3b2f1498bf9ccd567e9390c'),
(16, 'Malcolm', 115, 0, 'm', 'b24449675845d066d0b8b0823c8125e7'),
(17, 'Otis', 116, 0, 'm', 'cc75ca180881baa4d6fa02673e247891'),
(18, 'Sanford', 117, 0, 'm', '47a30d30bcbe2a852751dbcc6f846a48'),
(19, 'Bar', 118, 0, 'm', 'c635b159445bf65eaf68805aafbfe449'),
(20, 'Dulcia', 119, 0, 'm', '971203006ee3988df71c8dce120ed62d'),
(21, 'Lynelle', 120, 0, 'm', 'e380d864596c236b46e7e9297598bd91'),
(22, 'Thane', 121, 0, 'f', '12802dee624dc4382cc761ee16e9049c'),
(23, 'Hadria', 122, 0, 'f', '7b633fbc7a79639ca0ed9e86b3d7b850'),
(24, 'Jeth', 123, 0, 'm', 'dbf829de0fc6d960acf642256df6f1c8'),
(25, 'Ax', 124, 0, 'm', '81bf16e8e61c76f20631f228b5d6401a'),
(26, 'Ray', 125, 0, 'm', '0b618c0b08706e9a9d772681cc2b3dc6'),
(27, 'Saree', 126, 0, 'f', '658d752708031c70773697d141142449'),
(28, 'Milton', 127, 0, 'f', 'dc5fc071ee4b9ba79be9bea97caddd07'),
(29, 'Brietta', 128, 0, 'm', '3a7297da824766aa2c82ec069f26a010'),
(30, 'Edgardo', 129, 0, 'm', 'd3a54d3e32661d11afa91973eef2722d'),
(31, 'Celle', 130, 0, 'f', '90f2c3b376c855119f2811c7b6dee4b8'),
(32, 'Vonni', 131, 0, 'f', '537a4aa90cb5d278383dc20480b50ff3'),
(33, 'Audry', 132, 0, 'f', '1b12e7f99a35c37335faa6e5741f5c90'),
(34, 'Quintus', 133, 0, 'm', '4047a9a71734daf75cb41224bbbc1a19'),
(35, 'Jammie', 134, 0, 'f', '3ec9f4dfec574f3f635d732154039a6c'),
(36, 'Sigismondo', 135, 0, 'm', 'da1355be7bdc9425517ad8538a482f46'),
(37, 'Woodrow', 136, 0, 'f', 'c2eb78603e380ffcbf0497769bc98dc3'),
(38, 'Armand', 137, 0, 'm', '355051380edb5c9244f554838c9f4a89'),
(39, 'Carce', 138, 0, 'm', '78a95632af796ae18e14fcf1fdd11d66'),
(40, 'Damaris', 139, 0, 'm', 'e53a099f23001a619d25b2a9b599f959'),
(41, 'Libbi', 140, 0, 'm', 'd9cf17bb063d02833d29ff57b758b390'),
(42, 'Graham', 141, 0, 'f', '3aff260ed01bffcba608c6c257ff00d0'),
(43, 'Ollie', 142, 0, 'f', '3783fae4fdd6a76d89d0b5447005e398'),
(44, 'Beilul', 143, 0, 'f', '9a6975c26306024b52ef9bdc424d3762'),
(45, 'Carolee', 144, 0, 'm', 'ae4aa109f05d219f8bd850bf9935804f'),
(46, 'Valery', 145, 0, 'm', '4c34647a7ed1a7b28cc562ab6dd20462'),
(47, 'Alicia', 146, 0, 'm', '9c5708196bbd77fe1ba8537c4f10549f'),
(48, 'Selle', 147, 0, 'f', '4938e4734869370fff8d8bc45b5724ab'),
(49, 'Cindra', 148, 0, 'm', '2dabed5d8187b21e7f27a3b51e78f811'),
(50, 'Loni', 149, 0, 'm', '8cb0fa8a996dcc419d26ff6ce93d930d'),
(51, 'Ferdinanda', 150, 0, 'm', '28aa1efcc938a79f1c2e31c141fa8a0e'),
(52, 'Giovanni', 151, 0, 'f', '8e3b0e39cead27a75f0028e40985ae60'),
(53, 'Gawen', 152, 0, 'm', '65b98fc90a2773ce06d1fb519724d858'),
(54, 'Violette', 153, 0, 'm', '488327b472479ec1d64832f598aba6b3'),
(55, 'Raquel', 154, 0, 'm', '0cc38b30d6b459aa8af76f80903c77b7'),
(56, 'Pandora', 155, 0, 'm', 'ed2e3c5093ad48e6d363dcca82b638dc'),
(57, 'Marve', 156, 0, 'f', '0b5da12265fbc8f8fe4b7fb23e5e2ede'),
(58, 'Lenee', 157, 0, 'm', 'a5a3315897837a34aa79dd97ad3ee02f'),
(59, 'Marji', 158, 0, 'f', 'b0c42e005f4de11d0a5ca5aad4a5555b'),
(60, 'Conrado', 159, 0, 'f', 'f0ee3620173aa54d11328256c38cc683'),
(61, 'Lynde', 160, 0, 'm', '65d2ddb1b56fe5ec4b38b402ca16b73a'),
(62, 'Sisely', 161, 0, 'f', 'd6c68bd59350e2617f234b2d7f59cf4a'),
(63, 'Willey', 162, 0, 'm', 'e6f0027ae1f1b58c2da9e69e62c71736'),
(64, 'Sharl', 163, 0, 'f', 'c6fd527bb12eb3856a0411ed336eaf2b'),
(65, 'Hannis', 164, 0, 'f', '904939a4e50127dd07ac3d2541c73b36'),
(66, 'Allen', 165, 0, 'm', 'e4f02800e8548231ed1286308d96cdd5'),
(67, 'Kelwin', 166, 0, 'f', '44482ee6b509d272b1925949f1852603'),
(68, 'Zerk', 167, 0, 'f', 'f99762b13703eea5e319cca1eaac127f'),
(69, 'Talbot', 168, 0, 'm', 'f0078ef07d7a2f6e5c9f5c77159f725e'),
(70, 'Jacqueline', 169, 0, 'm', 'ec69a1852cf95015ce35064e388d33ec'),
(71, 'Nessy', 170, 0, 'f', '4240134fc5caf45b704c0890e436dd79'),
(72, 'Hale', 171, 0, 'm', '55c9bf05407cbcc3bffab11ac7e4446f'),
(73, 'Garrick', 172, 0, 'm', '2d68f7b560d13a6712d80a108ca1f8c1'),
(74, 'Davidde', 173, 0, 'm', '461112211122bbe7d90bd165020c82aa'),
(75, 'Leonardo', 174, 0, 'f', '755a29fb7f3dabf4fd336044cb7d62b1'),
(76, 'Wolfy', 175, 0, 'f', '45a47b2f5bfc837647c6594a59f4d805'),
(77, 'Skippie', 176, 0, 'f', 'b5dffbc6db7f1e2e423a0143f28d22fb'),
(78, 'Corena', 177, 0, 'm', '808e4755f6cbf1c309c7ad98f4b5b29e'),
(79, 'Charmion', 178, 0, 'f', '386672a6e4b02e57c5e625d59032e582'),
(80, 'Mariellen', 179, 0, 'f', '46f8c0b68d0e90e0fe3325f5643cb87d'),
(81, 'Ashlee', 180, 0, 'm', 'f588c60a846001ae87e7097fd867c3f7'),
(82, 'Kristofer', 181, 0, 'f', '2eecb18f63bee4c8a538ec416a6141e9'),
(83, 'Darla', 182, 0, 'm', '0407f1aa8ea5610c74a3d4af76dc829c'),
(84, 'Bonny', 183, 0, 'f', '214106164783f06a87c5ce821509f726'),
(85, 'Regine', 184, 0, 'f', '1b5754f569a58dc1892399a912e22624'),
(86, 'Tracee', 185, 0, 'm', 'd8579be1141d7c7f94d36370ae6c67b5'),
(87, 'Hughie', 186, 0, 'm', '440df97463838b9c72c324163483a9b0'),
(88, 'Cobbie', 187, 0, 'm', '8a1e546e415fac80847b0b7afca27de5'),
(89, 'Monika', 188, 0, 'f', 'de604080d59e9aaba2abe49a52307fd8'),
(90, 'Ramsay', 189, 0, 'm', '97cf3fb8407ab58a5c36a4a458f85c92'),
(91, 'Oralie', 190, 0, 'f', '2305fd6fdd58b2f150fb97ee0730d839'),
(92, 'Kenneth', 191, 0, 'f', 'e0b451fed2fa27425f0cb0127875e702'),
(93, 'Marylynne', 192, 0, 'm', '42d1553dd50e3be2aac5835f8d02ddbf'),
(94, 'Rochelle', 193, 0, 'm', '66a887f853d2da94f5e19c0eeaa23561'),
(95, 'Anica', 194, 0, 'm', 'bccf08da8970c46e49a85d80c5bed840'),
(96, 'Stan', 195, 0, 'f', '87b2ca87df3bc9d5ccd64559dfaf1f77'),
(97, 'Donnie', 196, 0, 'f', '1b8e51668faa9a248221ea87167a11e9'),
(98, 'Jenna', 197, 0, 'f', 'dba9d9cfc7b71f1fb8f26a60c647f5b8'),
(99, 'Colene', 198, 0, 'm', '5af50bd1ab2f8dbed5686054d38e71b4'),
(100, 'Marlo', 199, 0, 'm', '9aecdb2f7d4436ba872ef0d3c57e2e90'),
(101, 'Saloma', 200, 0, 'f', 'fc6484e281d657239d285c6309b76be7'),
(102, 'Karalynn', 201, 0, 'f', 'ba9ebe0aa142e32901ef9693e3a52789'),
(103, 'Dacy', 202, 0, 'm', 'ff89124980ca9c31f8fd2ed3e72d699e');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`Código`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`Código`);

--
-- Indices de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  ADD PRIMARY KEY (`Código`);

--
-- Indices de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  ADD PRIMARY KEY (`Código`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `Código` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=76;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `Código` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=151;

--
-- AUTO_INCREMENT de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  MODIFY `Código` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  MODIFY `Código` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
