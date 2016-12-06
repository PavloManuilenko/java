public enum Faculty {
        GRYFFINDOR("Gryffindor", "Гриффиндор"),
        SLYTHERIN ("Slytherin", "Слизерин"),
        HUFFLEPUFF("Hufflepuff", "Пуффендуй"),
        RAVENCLAW("Ravenclaw", "Когтевран");

        private String nameEn = new String();
        private String nameRu = new String();


        Faculty(String nameEn, String nameRu) {
                this.nameEn = nameEn;
                this.nameRu = nameRu;
        }

        public String getNameEn() {
                return nameEn;
        }

        public String getNameRu() {
                return nameRu;
        }
}

