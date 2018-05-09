package JsonServer


import io.gatling.core.Predef._
import io.gatling.http.Predef._

class RecordedSimulation extends Simulation {

  val httpProtocol = http.baseURL("http://localhost:3000")

  val headers = Map("Upgrade-Insecure-Requests" -> "1")

  val uri1 = "http://localhost:3000"

  val scn = scenario("GetAppUsers")
    .exec(http("GetAppUsers")
      .get("/posts")
      .check(status.is(200)))

  setUp(scn.inject(atOnceUsers(100))).protocols(httpProtocol)
}