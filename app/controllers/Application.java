package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

/**
 * This is the default controller generated by play
 *   and is disabled in the conf/routes files
 * Note: unless you know what you are doing, keep it here and
 *         don't edit or use it
 * */

@SuppressWarnings("unused")
public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
