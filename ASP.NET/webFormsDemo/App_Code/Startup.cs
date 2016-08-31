using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(webFormsDemo.Startup))]
namespace webFormsDemo
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
