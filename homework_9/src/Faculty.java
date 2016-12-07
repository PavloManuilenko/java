/*
2) Объявить класс перечислений Faculty у которого будут свойства nameEn(строка), nameRu(строка), и элементы перечисления: GRYFFINDOR, SLYTHERIN, HUFFLEPUFF, RAVENCLAW.
*/
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

