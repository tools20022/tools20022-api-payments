/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.FreightChargesCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Moving of goods or people from one place to another by vehicle.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Transport" src="doc-files/Transport.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#Incoterms
 * Transport.Incoterms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#Identification
 * Transport.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#Packaging
 * Transport.Packaging}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#ArrivalDateTime
 * Transport.ArrivalDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#PartialShipment
 * Transport.PartialShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransShipment
 * Transport.TransShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#ProductDelivery
 * Transport.ProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#PlaceOfDeparture
 * Transport.PlaceOfDeparture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#PlaceOfDestination
 * Transport.PlaceOfDestination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransportCharges
 * Transport.TransportCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#FreightChargesPrepaidOrCollect
 * Transport.FreightChargesPrepaidOrCollect}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#ShipmentDates
 * Transport.ShipmentDates}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransportedGoods
 * Transport.TransportedGoods}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#PartyRole
 * Transport.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransitLocation
 * Transport.TransitLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#TransportDocuments
 * Transport.TransportDocuments}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#DepartureTransportParameters
 * Location.DepartureTransportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#DestinationTransportParameters
 * Location.DestinationTransportParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#RelatedTransport
 * Location.RelatedTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Transport
 * Document.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#Transport
 * Charges.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#Transport
 * Incoterms.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods#Transport
 * Goods.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#Routing
 * ProductDelivery.Routing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#Transport
 * Packaging.Transport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#Transport
 * TransportPartyRole.Transport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#RelatedTransport
 * ShipmentDateRange.RelatedTransport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transport"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Moving of goods or people from one place to another by vehicle."</li>
 * </ul>
 */
public class Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the applicable Incoterm and associated location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Incoterms#Transport
	 * Incoterms.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Incoterms Incoterms}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Incoterms = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Incoterms.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Incoterms.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique identification of the means of transport, such as the
	 * International Maritime Organization number of a vessel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Physical packaging of goods for transport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#Transport
	 * Packaging.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical packaging of goods for transport."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Packaging = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of goods for transport.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time when the goods reach their destination..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArrivalDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time when the goods reach their destination.."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ArrivalDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ArrivalDateTime";
			definition = "Date and time when the goods reach their destination..";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether or not partial shipments are allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not partial shipments are allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialShipment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialShipment";
			definition = "Indicates whether or not partial shipments are allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether or not transshipment of goods is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not transshipment of goods is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransShipment = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransShipment";
			definition = "Indicates whether or not transshipment of goods is allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the delivery parameters of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#Routing
	 * ProductDelivery.Routing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the delivery parameters of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProductDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Specifies the delivery parameters of a trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.Routing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place from where the goods must leave.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#DepartureTransportParameters
	 * Location.DepartureTransportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDeparture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place from where the goods must leave."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfDeparture = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDeparture";
			definition = "Place from where the goods must leave.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.DepartureTransportParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place where the goods must arrive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#DestinationTransportParameters
	 * Location.DestinationTransportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDestination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the goods must arrive."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfDestination = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDestination";
			definition = "Place where the goods must arrive.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.DestinationTransportParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Charges related to the conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#Transport
	 * Charges.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the conveyance of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransportCharges = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportCharges";
			definition = "Charges related to the conveyance of goods.";
			minOccurs = 0;
			type_lazy = () -> Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies whether the freight charges associated with the items are
	 * "prepaid" or "collect".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FreightChargesCode
	 * FreightChargesCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreightChargesPrepaidOrCollect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FreightChargesPrepaidOrCollect = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreightChargesPrepaidOrCollect";
			definition = "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FreightChargesCode.mmObject();
		}
	};
	/**
	 * Specifies the shipment date, the earliest shipment date and the latest
	 * shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#RelatedTransport
	 * ShipmentDateRange.RelatedTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#ShipmentAttributes
	 * SupportingDocumentEntry1.ShipmentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#ShipmentSchedule
	 * TradeContract1.ShipmentSchedule}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the shipment date, the earliest shipment date and the latest shipment date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ShipmentDates = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SupportingDocumentEntry1.ShipmentAttributes, com.tools20022.repository.msg.TradeContract1.ShipmentSchedule);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShipmentDates";
			definition = "Specifies the shipment date, the earliest shipment date and the latest shipment date.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ShipmentDateRange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.RelatedTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Goods that are transported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Goods#Transport
	 * Goods.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Goods Goods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportedGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods that are transported."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransportedGoods = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			minOccurs = 1;
			type_lazy = () -> Goods.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Goods.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to the transport of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#Transport
	 * TransportPartyRole.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TransportPartyRole
	 * TransportPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies each role linked to the transport of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the transport of goods.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransportPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransportPartyRole.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place through which the goods are transiting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#RelatedTransport
	 * Location.RelatedTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransitLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place through which the goods are transiting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransitLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransitLocation";
			definition = "Place through which the goods are transiting.";
			minOccurs = 0;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.RelatedTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Documents which may be required in relation with the transportation of
	 * goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#Transport
	 * Document.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents which may be required in relation with the transportation of goods."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransportDocuments = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportDocuments";
			definition = "Documents which may be required in relation with the transportation of goods.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Transport";
				definition = "Moving of goods or people from one place to another by vehicle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.DepartureTransportParameters, com.tools20022.repository.entity.Location.DestinationTransportParameters,
						com.tools20022.repository.entity.Location.RelatedTransport, com.tools20022.repository.entity.Document.Transport, com.tools20022.repository.entity.Charges.Transport,
						com.tools20022.repository.entity.Incoterms.Transport, com.tools20022.repository.entity.Goods.Transport, com.tools20022.repository.entity.ProductDelivery.Routing, com.tools20022.repository.entity.Packaging.Transport,
						com.tools20022.repository.entity.TransportPartyRole.Transport, com.tools20022.repository.entity.ShipmentDateRange.RelatedTransport);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.Incoterms, com.tools20022.repository.entity.Transport.Identification, com.tools20022.repository.entity.Transport.Packaging,
						com.tools20022.repository.entity.Transport.ArrivalDateTime, com.tools20022.repository.entity.Transport.PartialShipment, com.tools20022.repository.entity.Transport.TransShipment,
						com.tools20022.repository.entity.Transport.ProductDelivery, com.tools20022.repository.entity.Transport.PlaceOfDeparture, com.tools20022.repository.entity.Transport.PlaceOfDestination,
						com.tools20022.repository.entity.Transport.TransportCharges, com.tools20022.repository.entity.Transport.FreightChargesPrepaidOrCollect, com.tools20022.repository.entity.Transport.ShipmentDates,
						com.tools20022.repository.entity.Transport.TransportedGoods, com.tools20022.repository.entity.Transport.PartyRole, com.tools20022.repository.entity.Transport.TransitLocation,
						com.tools20022.repository.entity.Transport.TransportDocuments);
			}
		});
		return mmObject_lazy.get();
	}
}