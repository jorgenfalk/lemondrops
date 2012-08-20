package controllers;

import com.google.common.collect.Lists;
import models.Board;
import models.Solution;
import play.*;
import play.mvc.*;

import views.html.*;

import static com.google.common.collect.Lists.asList;
import static com.google.common.collect.Lists.newArrayList;
import static play.libs.Json.parse;
import static play.libs.Json.toJson;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Welcome to Lemon Drops"));
    }

    public static Result board() {
        return ok(toJson(new Board(3, newArrayList(1,3,2, 3,2,1, 2,1,3 ))));
    }


    public static Result moves() {
        String moves = request().body().asJson().get("moves").asText();
        Solution solution = new Solution(3, moves);
        solution.solve();

        return ok(toJson(solution));
    }
}