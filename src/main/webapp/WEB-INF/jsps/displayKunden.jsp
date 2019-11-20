<%@ page %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Bereits erfasste Kundendaten</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
        table {
            border-collapse: separate;
            border-spacing: 10px 5px;
        }
    </style>
</head>
<body>
${msg}

<h2>Bereits erfasste Kundendaten</h2>
<hr>
Folgenden erfasste Kundendaten sind in Datenbank bereits vorhanden:<br>

<table>
    <tr>
        <th>ID</th>
        <th>Vorname</th>
        <th>Nachname</th>
        <th>Anrede</th>
        <th>Alter</th>
        <th>Geschlecht</th>
        <th>Strasse</th>
    </tr>

    <c:forEach items="${kunden}" var="kunde">
        <tr>
            <td>${kunde.id}</td>
            <td>${kunde.vorname}</td>
            <td>${kunde.nachname}</td>
            <td>${kunde.anrede}</td>
            <td>${kunde.alter}</td>
            <td>${kunde.geschlecht}</td>
            <td><%-- ${kunde.adresse.strasse} --%></td>
            <td><a href="deleteKunde?id=${kunde.id}">Kunde l&ouml;schen</a></td>
            <td><a href="showUpdate?id=${kunde.id}">Kunde aktualisieren</a></td>
        </tr>
    </c:forEach>

</table>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>