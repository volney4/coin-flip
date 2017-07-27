public class JavaSong {

	public static void line1() {
		System.out.println("There was an old woman who swallowed a fly.");
		line2();
		verse2();
		verse3();
		verse4();
		verse5();
		verse6();
		verse7();
		verse8();
	}

	public static void line2() {
		System.out.println("I don't know why she swallowed that fly,");
		line3();
	}

	public static void line3() {
		System.out.println("Perhaps she'll die.");
		System.out.println("");
	}

	public static void spider() {
		System.out.println("She swallowed the spider to catch the fly,");
		line2();
	}

	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
		spider();
	}

	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
		bird();
	}

	public static void dog() {
		System.out.println("She swallowed the dog to catch the cat,");
		cat();
	}

	public static void goat() {
		System.out.println("She swallowed the goat to catch the dog,");
		dog();
	}

	public static void cow() {
		System.out.println("She swallowed the cow to catch the goat,");
		goat();
	}

	public static void verse2() {
		System.out.println("There was an old woman who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spider();
	}

	public static void verse3() {
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		bird();
	}

	public static void verse4() {
		System.out.println("There was an old woman who swallowed a cat.");
		System.out.println("Imagine that to swallow a cat.");
		cat();
	}

	public static void verse5() {
		System.out.println("There was an old woman who swallowed a dog.");
		System.out.println("What a hog to swallow a dog.");
		dog();
	}

	public static void verse6() {
		System.out.println("There was an old woman who swallowed a goat.");
		System.out.println("She just opended her throat to swallow a goat.");
		goat();
	}

	public static void verse7() {
		System.out.println("There was an old woman who swallowed a cow.");
		System.out.println("I don't know how she swallowed a cow.");
		cow();
	}

	public static void verse8() {
		System.out.println("There was an old woman who swallowed a horse.");
		System.out.println("She died of course.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		line1();
	}
}