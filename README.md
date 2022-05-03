# QC10452

Cette maquette a été développée pour illustrer l'annomalie QC 10452.

Les détails de cette annomaloie sont disponibles dans le service Quality Center.

Le projet consiste dans un service simple JAX-WS qui permet de comparer:

* les résultats obtenus lors de l'exécution des tests Java
* les résultats obtenu lors de l'exécution des tests SoapUI
* les résultats obtenus lors de l'exécution des tests Postman

Pour exécuter les test:

1. Cloner le projet:

   git clone ...
2. Effectuer le build et exécuter les tests unitaires, d'intégration, end to end et BD

   ./build.sh
3. Exécuter les tests SoapUI. Démarez SoapUI et ouvrez le fichier ./qc10452-soapui-projetc.xml. Exécutez les requetes.
4. Exécuter les tests Postman. Démarez Postman et importez le fichier ./grdf.postman_collection.json. Exécutez les requetes.

## Les résultats des tests

Le tableau ci-dessous résume les résultats des tests:


| **Client** | **Opération** | **Entrée**      | **Sortie**       | **Sortie affichée** |
| -----------| ---------------| -----------------| -----------------| ------------------|
| Java       | Escape         | \>160M3/H        | \&amp;gt;160M3/H | N/A               |
| Java       | Escape         | \&gt;160M3/H     | \&amp;gt;160M3/H | N/A               |
| Java       | Escape         | \<160M3/H        | \&lt;160M3/H     | N/A               |
| Java       | Escape         | \&lt;160M3/H     | \&amp;lt;160M3/H | N/A               |
| Java       | Unescape       | \&gt;160M3/H     | \>160M3/H        | N/A               |
| Java       | Unescape       | \&amp;gt;160M3/H | \&gt;160M3/H     | N/A               |
| Java       | Unescape       | \&lt;160M3/H     | \<160M3/H        | N/A               |
| Java       | Unescape       | \&amp;lt;160M3/H | \&lt;160M3/H     | N/A               |
|            |                |                  |                  |                   |
| SoapUI     | Escape         | \>160M3/H        | \&gt;160M3/H     | \>160M3/H         |
| SoapUI     | Escape         | \&gt;160M3/H     | \&gt;160M3/H     | \&gt;160M3/H      |
| SoapUI     | Escape         | \<160M3/H        | Error            | Error             |
| SoapUI     | Escape         | \&lt;160M3/H     | \&lt;160M3/H     | \&lt;160M3/H      |
| SoapUI     | Unescape       | \&gt;160M3/H     | \&gt;160M3/H     | \&gt;160M3/H      |
| SoapUI     | Unescape       | \&amp;gt;160M3/H | \&amp;gt;160M3/H | \&amp;gt;160M3/H  |
| SoapUI     | Unescape       | \&lt;160M3/H     | \&lt;160M3/H     | \&lt;160M3/H      |
| SoapUI     | Unescape       | \&amp;lt;160M3/H | \&amp;lt;160M3/H | \&amp;lt;160M3/H  |
|            |                |                  |                  |                   |
| Postman    | Escape         | \>160M3/H        | \&gt;160M3/H     | N/A               |
| Postman    | Escape         | \&gt;160M3/H     | \&gt;160M3/H     | N/A               |
| Postman    | Escape         | \<160M3/H        | Error            | N/A               |
| Postman    | Escape         | \&lt;160M3/H     | \&lt;160M3/H     | N/A               |
| Postman    | Unescape       | \&gt;160M3/H     | \&gt;160M3/H     | N/A               |
| Postman    | Unescape       | \&amp;gt;160M3/H | \&amp;gt;160M3/H | N/A               |
| Postman    | Unescape       | \&lt;160M3/H     | \&lt;160M3/H     | N/A               |
| Postman    | Unescape       | \&amp;lt;160M3/H | \&amp;lt;160M3/H | N/A               |
