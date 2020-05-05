/**
 * Swagger Petstore
 * This is a sample server.  You can find  out more about Swagger at  [http://swagger.io](http://swagger.io) or on  [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Order (
  id: Option[Long] = None,
  petId: Option[Long] = None,
  quantity: Option[Int] = None,
  shipDate: Option[DateTime] = None,
  /* Order Status */
  status: Option[OrderEnums.Status] = None,
  complete: Option[Boolean] = None
) extends ApiModel

object OrderEnums {

  type Status = Status.Value
  object Status extends Enumeration {
    val Placed = Value("placed")
    val Approved = Value("approved")
    val Delivered = Value("delivered")
  }

}

