import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

class Main {
    public static JFrame frame;
    public static JTextField searchField;
    public static ImageIcon image;
    public static ImageIcon resizedIcon;

    // Create the Recipe class
    static class Recipe {
        private String dishName;
        private String recipeDetails;
        private String ingredients;

        public Recipe(String dishName, String recipeDetails) {
            this.dishName = dishName;
            this.recipeDetails = recipeDetails;
            this.ingredients =ingredients;
        }

        public String getDishName() {
            return dishName;
        }

        public String getRecipeDetails() {
            return recipeDetails;

        }

        public String getIngredients() {
            return ingredients;
        }
    }

    public static void main(String[] args) {
        // Insert the recipe list
        ArrayList<Recipe> recipes = new ArrayList<>();
        recipes.add(new Recipe("Spaghetti", "INGREDIENTS: \n- 1/2 cup Angel Evaporated Filled Milk \n- 1/2 kilo spaghetti noodles \n- 1/4 kilo ground beef \n- 1 tbsp chopped garlic \n- 1/4 cup chopped onion \n- 1/2 cup sliced hotdogs \n- 1 1/2 cups tomato sauce \n- 1 cup banana catsup \n- 2 tbsp sugar \n- 1 tsp salt \n- 1 tbsp ground black pepper \nSTEPS: \n1. Cook spaghetti as directed in the package. Drain, rinse and set aside. \n2. In a hot pan or skillet, cook beef until brown and its juice and oil come out. Stir in garlic, onion and hotdogs. Cook for about 2 to 3 minutes or until aromatic. \n3. Pour tomato sauce and catsup. Add sugar, salt and pepper. Cover and cook for about 10 minutes with occasional stirring. \n4. Stir in Angel Evaporated Filled Milk and immediately remove from heat. \n5. Pour sauce over cooked spaghetti and serve."));
        recipes.add(new Recipe("Pancakes", "Ingredients: \n- 1 ½ cups all-purpose flour \n- 3 ½ teaspoons baking powder \n- 1 tablespoon white sugar \n- ¼ teaspoon salt, or more to taste \n- 1 ¼ cups milk \n- 3 tablespoons butter, melted \n- 1 large egg \nSteps: \n1. Sift flour, baking powder, sugar, and salt together in a large bowl. Make a well in the center and add milk, melted butter, and egg; mix until smooth. \n2. Heat a lightly oiled griddle or pan over medium-high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. \n3. Cook until bubbles form and the edges are dry, about 2 to 3 minutes. \n4. Flip and cook until browned on the other side. \n5. Repeat with remaining batter, and serve."));
        recipes.add(new Recipe("Adobo", "Ingredients: \n- 2 tablespoons vegetable oil \n- 1 (3 pound) chicken, cut into pieces \n- 1 large onion, quartered and sliced \n- 2 tablespoons minced garlic \n- ⅔ cup low sodium soy sauce \n- ⅓ cup white vinegar \n- 1 tablespoon garlic powder \n- 2 teaspoons black pepper \n- 1 bay leaf \nSteps: \n1. Heat vegetable oil in a large skillet over medium-high heat. Cook chicken pieces until golden brown, 2 to 3 minutes per side. Transfer chicken to a plate and set aside. \n2. Add onion and garlic to the skillet; cook until softened and brown, about 3 to 5 minutes. \n3. Pour in soy sauce and vinegar and season with garlic powder, black pepper, and bay leaf. \n4. Return chicken to pan, increase heat to high, and bring to a boil. Reduce heat to medium-low, cover, and simmer until chicken is tender and cooked through, 35 to 40 minutes."));
        recipes.add(new Recipe("Sinigang", "Ingredients: \n- 1 tablespoon vegetable oil \n- 1 small onion, chopped \n- 1 teaspoon salt \n- 1 (1/2 inch) piece fresh ginger, chopped \n- 2 plum tomatoes, cut into 1/2-inch dice \n- 1 pound bone-in pork chops(Chicken/Beef) \n- 4 cups water, more if needed \n- 1 (1.41 ounce) package tamarind soup base (such as Knorr®) \n- ½ pound fresh green beans, trimmed \nSteps: \n1. Heat vegetable oil in a skillet over medium heat. Add onion; cook and stir until softened and translucent, about 5 minutes. Season with salt. \n2. Stir in ginger, tomatoes, and pork chops. Cover and reduce heat to medium-low. Turn the pork occasionally, until browned. \n3. Pour in water and tamarind soup base. Bring to a boil, then reduce heat and simmer until the pork is tender and cooked through, about 30 minutes. \n4. Pour in water and tamarind soup base. Bring to a boil, then reduce heat and simmer until the pork is tender and cooked through, about 30 minutes. \n5. Stir in green beans and cook until tender."));
        recipes.add(new Recipe("Chicken Curry", "Ingredients: \n- 2 1/2 lbs. chicken cut into serving pieces \n- 1 pack Knorr Ginataang Gulay Mix 45 grams\n- 2 pieces baking potato cubed \n- 2 pieces red bell pepper sliced into squares \n- 3/4 cup chopped celery \n- 2 pieces red onions chopped \n- 3 cloves garlic chopped \n- 1 1/2 tablespoons curry powder \n- 3 pieces long green chili pepper \n- 4 tablespoons cooking oil \n- 2 cups water \n- 1 1/2 teaspoons fish sauce \n- 1/4 teaspoon ground black pepper \nSteps:\n1. Heat oil in a pot. Pan fry the chicken pieces for 1 ½ to 2 minutes per side. Remove the chicken from the cooking pot. Set aside. \n2. Combine Knorr Ginataang Gulay recipe Mix with 2 cups water. Stir until well blended. Set aside. \n3. Heat remaining oil on the pot. Saute onion and garlic. Add the celery. Continue to cook until onion and celery softens. \n4. Pour the gata mixture into the pot. Let boil. \n5. Add curry powder. Stir until the powder totally dilutes in coconut milk. \n6. Put the pan-fried chicken into the pan. Cover and cook in medium heat for 30 to 35 minutes or until tender. \n6. Add red bell pepper, long green pepper, and potato. Cover the pot and cook for 5 to 8 minutes. \n7. Add fish sauce and ground black pepper. Stir. \n8. Transfer to a serving plate. Serve. Share and enjoy! ."));
        recipes.add(new Recipe("Pinakbet", "Ingredients: \n- 200 g pork belly, cut into small pieces \n- 2 tbsp canola oil \n- 1 small pc red onion, chopped \n- 1 tbsp ginger, cut into strips \n- 3 cloves garlic, chopped \n- 3 pcs ripe tomatoes, cubed \n 2 tbsp shrimp paste (bagoong) \n- 2 cups squash, cubed \n- 1/2 cup water \n- 1 pc Knorr Shrimp Cube \n- 1 bunch sitaw, cut into 2 inch pieces \n- 1 pc small ampalaya, sliced thinly \n- 1 -2 eggplants, sliced \n- 6 -8 pcs okra, sliced \nSteps:\n1. Fry pork belly in hot oil until brown and crispy. Drain and set aside.\n2. Using the same pan, saute onions, ginger, garlic. \n3. Add tomatoes and continue sautéing until soft. \n4. Then Add shrimp paste. Mix well.\n5. Add squash, water and Knorr Shrimp Cube. \n6. Cover and let cook over medium heat for 8 minutes. \n7. Add sitaw, ampalaya, eggplants and okra. Mix and cover. \n8. Let cook for another 5-8 minutes. Serve warm."));
        recipes.add(new Recipe("Tinola", "Ingredients:\n- 1 tbsp cooking oil \n- 1 pc onion, small -sized, chopped \n- 2 cloves garlic, chopped \n- 1 pc ginger, cut into strips \n- ½ kilo chicken, chop it \n- 4 cups water \n- 2 pcs Knorr chicken cubes \n- 1 pc chayote or 1 pc small - sized green papaya, sliced \n- 2 stalks moringa leaves  \nSteps:\n1. Get a pot and bring it up to medium heat before pouring in the oil. \n2. Drop in the onions, garlic and ginger and sauté slowly for about 2 minutes or until you can smell the lovely aroma. \n3. It’s time to drop in the chicken pieces and stir until it turns white or light brown in color. \n4. Pour in the water and add your Knorr Chicken Broth cubes. \n5. Bring this to a simmer until chicken is tender and cooked through. \n6. You can now add your sayote or green papaya and cook until tender. \n7. Dahon ng sili is added at the last stage to ensure leaves (and nutrients) don’t dry up. \n( Malunggay is also another healthy alternative because it is packed with vitamins and minerals which are good for nursing moms and kids as well) \n8. Give this a minute then it is done.  \n9. Enjoy this with patis and calamansi on the side. See the faces of your whole family light up as you bring this to the table."));
        recipes.add(new Recipe("Pork sisig", "Ingredients:\n- 500 grams pig's mask or pork belly (trim excess fat if preferred) \n- as needed fish sauce and black pepper \n- as needed canola oil \n- 1 pc red onion, chopped \n- 1 (1-inch) pc ginger, chopped \n- 1/4 cup chicken liver, chopped (optional) \n- 1 pc green chilli, sliced \n- as needed bird's eye chilli, sliced \n- as needed Knorr Liquid Seasoning \n- 5 tbsps Lady's Choice real mayonnaise \n- 3 pcs calamansi \nSteps:\n1. Season boiled meats then grill or cook in a 375F oven until crispy. \n2. Chop meat into small cubes. \n3. In pan, sauté onion and ginger. \n3. Add chicken liver and sauté until cooked. \n4. Add the chopped meats, and chilies. \n5. Season with Knorr Liquid Seasoning according to taste. \n6. Off the heat, add Lady’s Choice Real Mayonnaise and mix well. \n7. Serve hot with calamansi."));
        recipes.add(new Recipe("Bulalo", "Ingredients:\n- 2 beef marrow bones (cut to expose marrow on one end\n- 1 poundbeef shank \n- 1 onion \n- 3 clovesgarlic quartered \n- 1 teaspoon black peppercorns \n- 2 tablespoons patis (fish sauce, salt (to taste) \n- 2 cobs corn (cut into 2-inch segments) \n- 1 chayote (peeled and cubed)\n- 3 baby bok choy (leaves separated)\nSteps:\n1.Boil a large pot of water. Add the marrow bones and beef shank and return to a boil. \n2. Continue boiling until you don't see any more red blood coming from the meat or bones (about 10 minutes) \n3. Then remove the meat and bones with tongs and scrub under cold water to remove any scum. \n4. Dump the water in the pot out and rinse the pot. (This process rids the meat of excess blood and will ensure your soup is nice and clear.) \n5. Return the cleaned meat and bones to the pot then add the onion, garlic, peppercorns and patis. \n6. Cover with water then bring it to a rolling boil and skim off any scum that accumulates. \n7. Reduce the heat to medium low. If you are using a pressure cooker, afix the lid and let it cook for 1 ½ hours. \n8.  If you're not using a pressure cooker, simmer until the meat on the shank is fork tender (4-5 hours). \n9. Skim off any excessive fat from the top but do not remove it all (remember, fat=flavour). \n10. Transfer the meat and bones to a bowl, then strain the stock through a fine mesh sieve, discard the solids then return the meat and bones to the strained stock. \n11. Add the corn and chayote and simmer for another 20 minutes or until the chayote is tender. Salt to taste, then add the bok choy at the last minute. Serve with rice."));





        // Develop the main frame
        frame = new JFrame("CookSmart - Recipe Finder" );
        frame.setSize(1300, 600);
        frame.getContentPane().setBackground(new Color(245, 245, 220));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Title label
        JLabel titleLabel = new JLabel("CookSmart - Find Your Recipe!", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(new Color(34, 177, 76));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(titleLabel, gbc);

        // Search panel
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        searchPanel.setBackground(new Color(245, 245, 220));;
        JLabel searchLabel = new JLabel("Enter Dish Name:");
        searchField = new JTextField(30);
        searchField.setBorder(new LineBorder(Color.WHITE, 2, true));
        JButton searchButton = new JButton("Search Recipe");
        searchButton.setFont(new Font("Arial", Font.BOLD, 15));
        searchButton.setFocusPainted(false);
        searchButton.setBorderPainted(false);
        searchButton.setOpaque(true);
        searchButton.setContentAreaFilled(true);
        searchButton.setBackground(new Color(34, 177, 76));
        searchButton.setForeground(Color.WHITE);
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 0;
        gbc.gridheight = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(searchPanel, gbc);

        searchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                //When Enter key is pressed
                if(e.getKeyCode()==10){
                    getRecipe(recipes);
                }
            }
        });
        // ActionListener for the search button
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getRecipe(recipes);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

    private static void getRecipe(ArrayList<Recipe> recipes){

        String dishName = searchField.getText().trim();
        if (!dishName.isEmpty()) {
            String recipeDetails = findRecipe(recipes, dishName);

            if(Character.isLowerCase(dishName.charAt(0))){
                dishName = dishName.substring(0,1).toUpperCase() + dishName.substring(1);
                String file = String.format("%s\\src\\images\\%s.jpg", Paths.get("").toAbsolutePath().toString(), dishName);
                image = new ImageIcon(file);
                Image originalImage = image.getImage(); // Get the original image
                Image resizedImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH); // Resize to 200x200 pixels
                resizedIcon = new ImageIcon(resizedImage); // Wrap it back in an ImageIcon
            }
            if (recipeDetails != null) {
                JOptionPane.showMessageDialog(frame, recipeDetails , "Recipe for " + dishName, JOptionPane.INFORMATION_MESSAGE, resizedIcon);
            } else {
                JOptionPane.showMessageDialog(frame,"Recipe not found. Please try another dish.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Please enter a dish name! ", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    // Way to locate a Recipe
    private static String findRecipe(ArrayList<Recipe> recipes, String dishName) {
        for (Recipe recipe : recipes) {
            if (recipe.getDishName().equalsIgnoreCase(dishName)) {
                return recipe.getRecipeDetails();
            }
        }
        return null; // Return null if the recipe is not found
    }
}
