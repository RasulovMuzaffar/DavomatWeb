<%-- 
    Document   : index
    Created on : 15.03.2017, 12:14:01
    Author     : Muzaffar
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Талабалар давомати</title>

        <!-- Bootstrap -->
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="resources/css/adminstyle.css" rel="stylesheet">
        <link href="resources/css/justified-nav.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="resources/scripts/html5shiv.js"></script>
        <script src="resources/scripts/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="container-fluid">
            <h3>Талабалар давомати</h3>
        </div>

        <div class="container-fluid">
            <div class="current_date"><b>2016-2017 укув йили</b><br/><br/><b>2-семестр</b></div>
            <div class="tabs">
                <input id="tab1" type="radio" name="tabs" checked>
                <label for="tab1" title="I-kurs">I-курс</label>
                <input id="tab2" type="radio" name="tabs">
                <label for="tab2" title="II-kurs">II-курс</label>
                <input id="tab3" type="radio" name="tabs">
                <label for="tab3" title="III-kurs">III-курс</label>
                <input id="tab4" type="radio" name="tabs">
                <label for="tab4" title="IV-kurs">IV-курс</label>
                <section id="content-tab1">
                    <ul class="nav nav-justified">
                        <li class="active">
                            <a href="#">IQ-178</a>
                        </li>
                        <li><a href="#">IQ-179</a></li>
                        <li><a href="#">MN-52</a></li>
                        <li><a href="#">MN-53</a></li>
                        <li><a href="#">MN-54</a></li>
                        <li><a href="#">BHA-36</a></li>
                        <li><a href="#">BHA-37</a></li>
                        <li><a href="#">AT-27</a></li>
                        <li><a href="#">AT-28</a></li>
                    </ul>
                    <br/>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th rowspan="4" class="text-center">№</th>
                                <th rowspan="4" class="text-center">Фамилияси, Исми, Шарифи</th>
                                <th rowspan="4" class="text-center">Гурух</th>
                                <th rowspan="4" class="text-center">Г/К</th>
                                <th colspan="36" class="text-center">Семестр давомидаги хафталар</th>
                                <th rowspan="4" class="text-center" style="font-size: 14pt"><b>&sum;</b></th>
                                <th rowspan="4" class="text-center" style="background-color: #00dc00; font-size: 14pt"><b>&sum;</b></th>
                                <th rowspan="4" class="text-center" style="background-color: red; font-size: 14pt"><b>&sum;</b></th>
                            </tr>
                            <tr>
                                <th colspan="2" class="text-center">1</th>
                                <th colspan="2" class="text-center">2</th>
                                <th colspan="2" class="text-center">3</th>
                                <th colspan="2" class="text-center">4</th>
                                <th colspan="2" class="text-center">5</th>
                                <th colspan="2" class="text-center">6</th>
                                <th colspan="2" class="text-center">7</th>
                                <th colspan="2" class="text-center">8</th>
                                <th colspan="2" class="text-center">9</th>
                                <th colspan="2" class="text-center">10</th>
                                <th colspan="2" class="text-center">11</th>
                                <th colspan="2" class="text-center">12</th>
                                <th colspan="2" class="text-center">13</th>
                                <th colspan="2" class="text-center">14</th>
                                <th colspan="2" class="text-center">15</th>
                                <th colspan="2" class="text-center">16</th>
                                <th colspan="2" class="text-center">17</th>
                                <th colspan="2" class="text-center">18</th>
                            </tr>
                            <tr>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                                <th colspan="2" class="text-center">06.03 11.03</th>
                            </tr>
                            <tr>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                                <th class="text-center">U</th>
                                <th class="text-center" style="background-color: rgba(0,255,0,0.27)">S</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>Иванов Иван Иванович</td>
                                <td>IQ-178</td>
                                <td>Г</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                        </tbody>
                    </table>
                </section>
                <section id="content-tab2">
                    <p> 2 kurs</p>
                </section>
                <section id="content-tab3">
                    <p>3 kurs</p>
                </section>
                <section id="content-tab4">
                    <p> 4 kurs</p>
                </section>
            </div>
            <!--<div class="info"> сделано с любовью: <a href="http://twitter.com/dobrovoi"><i class="fa fa-heart"></i> dobrovoi</a> </div>-->
        </div>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="resources/scripts/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="resources/scripts/bootstrap.min.js"></script>
    </body>
</html>
