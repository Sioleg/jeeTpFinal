package tp1;

public class Personne {
		private String nom;
		private String prenom;
		private String age;
		
		public Personne(String nom,String prenom,String age){
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
		}
		
		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}
		
		public void setNom(String nom){
			this.nom = nom;
		}
		
		public String getNom(){
			return this.nom;
		}
		
		public String toString() {
			return nom;
		}
}
