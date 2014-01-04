package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Contacts  extends Controller {
	
	public static Result index() {
		return ok(index.render("This is a test..."));
	}

	public static Result create() {
		return TODO;
	}

	public static Result edit(Long id) {
		return TODO;
	}

	public static Result update(Long id) {
		return TODO;
	}

	public static Result delete(Long id) {
		return TODO;
	}
}
