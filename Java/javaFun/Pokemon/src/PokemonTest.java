public class PokemonTest{
    public static void main(String[] args){
        Pokedex pokedex = new Pokedex();

        Pokemon squirtle   = pokedex.createPokemon("squirtle",65,"water");//Kinda pointless to even have this method if we could just call Pokemons Constructor, but ok.
        Pokemon charmander = pokedex.createPokemon("charmander",70,"fire");
        Pokemon bulbasaur  = pokedex.createPokemon("bulbasaur",60,"grass");
        Pokemon pikachu    = pokedex.createPokemon("pikachu",55,"electric");

        pokedex.pokemonInfo(squirtle);
        pokedex.attackPokemon(squirtle);
        pokedex.pokemonInfo(squirtle);

        Pokemon.getCount();
    }
}