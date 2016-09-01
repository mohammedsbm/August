using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using MVCExcercise.Models;

namespace MVCExcercise.Controllers
{
    public class HomeController : Controller
    {
        List<Album> albums = new List<Album>();

        // GET: Home
        public ActionResult Index()
        {
            Album album1 = new Album("Dark side of the moon", "Pink Floyyd", "Vinyl", 9.99m);
            albums.Add(album1);

            Album album2 = new Album("Tubular Bells", "Mike Oldfield", "Vinyl", 8.99m);
            albums.Add(album2);

            Album album3 = new Album("Back to Black", "Amy Winehouse", "CD", 12.99m);
            albums.Add(album3);

            return View(albums);
        }
    }
}