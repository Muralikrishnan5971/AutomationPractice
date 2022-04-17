package seleniumBasic;

public enum DropDown {

	INDEX {

		@Override
		public String toString() {
			return "index";

		}
	},
	
	VISIBLETEXT {

		@Override
		public String toString() {
			return "visibletext";

		}
	},
	
	VALUE {

		@Override
		public String toString() {
			return "value";

		}
	}
}
