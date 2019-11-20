<%@ page %>

<html>
<head>
    <title>Neue Adresse erfassen</title>
</head>

<body>
<h2>Neue Adresse erfassen</h2>
<hr>
Bitte geben sie alle Daten ein um eine neue Adresse zu erfassen:<br>

<form action="createAdresse" method="POST">
    <table>
        <tr>
            <td><label for="id">ID: </label></td>
            <td><input type="text" name="id" id="id" required></td>
        </tr>
        <tr>
            <td><label for="kundeId">Kunde ID: </label></td>
            <td><input type="text" name="kundeId" id="kundeId" required></td>
        </tr>
        <tr>
            <td><label for="strasse">Strasse: </label></td>
            <td><input type="text" name="strasse" id="strasse" required></td>
        </tr>
        <tr>
            <td><label for="hausnummer">Hausnummer: </label></td>
            <td><input type="text" name="hausnummer" id="hausnummer" required></td>
        </tr>
        <tr>
            <td><label for="plz">PLZ: </label></td>
            <td><input type="text" name="plz" id="plz" required></td>
        </tr>
        <tr>
            <td><label for="ort">Ort: </label></td>
            <td><input type="text" name="ort" id="ort" required></td>
        </tr>
        <tr>
            <td><label for="land">Land: </label></td>
            <td><input type="text" name="land" id="land" required></td>
        </tr>
    </table>
</form>
</body>
</html>