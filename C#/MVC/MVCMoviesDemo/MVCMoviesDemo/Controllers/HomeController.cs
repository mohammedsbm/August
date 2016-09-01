using MVCMoviesDemo.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MVCMoviesDemo.Controllers
{
    public class HomeController : Controller
    {
        private MoviesDBMohammedEntities db = new MoviesDBMohammedEntities();
        // GET: Home
        public ActionResult Index()
        {
            //LINQ query to get records
            var movies = from m in db.Movies
                         select m;
            return View(movies);
        }
    }
}