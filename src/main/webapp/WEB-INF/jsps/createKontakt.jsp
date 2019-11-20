<%@ page %>

<html>
<head>
    <title>Neue Kontaktdaten erfassen</title>

    <style>
        table {
            border-collapse: separate;
            border-spacing: 10px 5px;
        }
    </style>
</head>

<body>
<h2>Neue Kontaktdaten erfassen</h2>
<hr>
Bitte geben sie alle Daten ein um die neuen Kontaktdaten zu erfassen:<br>

<form action="createKontakt" method="POST">
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
            <td><label for="emailAdresse">E-Mail-Adresse: </label></td>
            <td><input type="text" name="emailAdresse" id="emailAdresse" required></td>
        </tr>
        <tr>
            <td><label for="telefonHandy">Telefon Handy: </label></td>
            <td><input type="text" name="telefonHandy" id="telefonHandy" required></td>
        </tr>
        <tr>
            <td><label for="telefonPrivat">Telefon Privat: </label></td>
            <td><input type="text" name="telefonPrivat" id="telefonPrivat" required></td>
        </tr>
        <tr>
            <td><label for="telefonGeschaeft">Telefon Gesch&auml;ft: </label></td>
            <td><input type="text" name="telefonGeschaeft" id="telefonGeschaeft" required></td>
        </tr>
        <tr>
            <td><label for="socialNetwork1">Soziales Netzwerk 1: </label></td>
            <td><input type="text" name="socialNetwork1" id="socialNetwork1" required></td>
        </tr>
        <tr>
            <td><label for="socialNetwork2">Soziales Netzwerk 2: </label></td>
            <td><input type="text" name="socialNetwork2" id="socialNetwork2" required></td>
        </tr>
    </table>
</form>
</body>
</html>