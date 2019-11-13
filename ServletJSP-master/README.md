# ServletJSP

Créer un projet avec Gradle :

télécharger le projet

décompresser le projet

ouvrir une fenêtre de commande dans le dossier du projet

compiler le projet avec Gradle :

	- sous Linux : ./gradlew build  	(faire éventuellement un chmod 777 gradlew si gradlew n'est pas exécutable)
	- sous Windows : gradlew build
	
convertir le projet en un projet Eclipse : 

	- sous Linux : ./gradlew eclipse
	- sous Windows : gradlew eclipse

	importer le projet sous Eclipse : File -> Import -> General -> Existing project into Eclipse...

lancer le projet (en utilsant le serveur web Jetty) :

	- sous Linux : ./gradlew appRun
	- sous Windows : gradlew appRun
