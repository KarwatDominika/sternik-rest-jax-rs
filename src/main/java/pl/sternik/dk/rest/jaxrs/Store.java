package pl.sternik.dk.rest.jaxrs;

import javax.ws.rs.*;

@Path("/store")
public class Store {

    @GET
    @Path("/article/{id}")
    @Produces("application/json")
    public Article getArticle(@PathParam("id") String id) {
        Article article = new Article();
        article.setId(Integer.valueOf(id));
        article.setName("Mleko");
        return article;
    }

    @PUT
    @Path("/article")
    @Consumes("application/json")
    public void addArticle(Article art) {
    }

    @GET
    @Path("/articles")
    @Produces("application/xml")
    public Article getArticles(@QueryParam("id") String id) {
        Article articles = new Article();
        articles.setId(Integer.valueOf(id));
        articles.setName("Mleko");
        return articles;
    }

    @PUT
    @Path("/articles")
    @Consumes("application/xml")
    public void addArticles(Article art) {

    }
}