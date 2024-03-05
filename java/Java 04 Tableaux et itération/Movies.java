public class Movies {
    public static void main(String[] args) {
        String[][] movies = {
            {"Indiana Jones et le Royaume du Crâne de Cristal", "Harrison Ford, Cate Blanchett"},
            {"Indiana Jones et la Dernière Croisade", "Harrison Ford, Sean Connery"},
            {"Indiana Jones et le Temple maudit", "Harrison Ford, Kate Capshaw"}
        };
        
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Film: " + movies[i][0] + ", Acteurs: " + movies[i][1]);
        }
    }
}