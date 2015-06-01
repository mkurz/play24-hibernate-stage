package controllers;

import models.*;
import play.*;
import play.mvc.*;

import views.html.*;
import play.db.jpa.Transactional;

public class Application extends Controller {

    @Transactional(readOnly = true)
    public Result index() {
        Test.findAll();
        return ok(index.render("Your new application is ready."));
    }

}
