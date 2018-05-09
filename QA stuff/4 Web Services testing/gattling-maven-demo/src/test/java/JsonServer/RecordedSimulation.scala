package JsonServer


import io.gatling.core.Predef._
import io.gatling.http.Predef._

// This is required for setUp(scn.inject(rampUsers(300) over(1200 seconds))).protocols(httpProtocol)
import scala.concurrent.duration._

class RecordedSimulation extends Simulation {

  val httpProtocol = http.baseURL("http://localhost:3000")

  val headers = Map("Upgrade-Insecure-Requests" -> "1")

  val uri1 = "http://localhost:3000"

  val scn = scenario("GetAppUsers")
    .exec(http("GetAppUsers")
      .get("/posts")
      .check(status.is(200)))

  // ---------------------------------------------------------------
  // setUP Section
  // ---------------------------------------------------------------
  // setup is used to define load testing
  // scn in this case is the name of scenario
  // atOnceUsers(X) -> X users will start scenario simulataniously
  // rampUsers(X) over (Y seconds) -> Start one user and add new user each Y seconds until they reach number of X
  // Example:
  //  setUp(
  //    users.inject(rampUsers(10) over (10 seconds)),
  //    admins.inject(rampUsers(2) over (10 seconds))
  //  ).protocols(httpConf)
  //
  // More examples:
  // http://gatling.io/docs/2.1.1/general/simulation_setup.html

  setUp(scn.inject(rampUsers(20) over (10 seconds))).protocols(httpProtocol)
}