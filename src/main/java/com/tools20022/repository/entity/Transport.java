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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.FreightChargesCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SupportingDocumentEntry1;
import com.tools20022.repository.msg.TradeContract1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
 * Transport.mmIncoterms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmIdentification
 * Transport.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPackaging
 * Transport.mmPackaging}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmArrivalDateTime
 * Transport.mmArrivalDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPartialShipment
 * Transport.mmPartialShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmTransShipment
 * Transport.mmTransShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmProductDelivery
 * Transport.mmProductDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
 * Transport.mmPlaceOfDeparture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
 * Transport.mmPlaceOfDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
 * Transport.mmTransportCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmFreightChargesPrepaidOrCollect
 * Transport.mmFreightChargesPrepaidOrCollect}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
 * Transport.mmShipmentDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportedGoods
 * Transport.mmTransportedGoods}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmPartyRole
 * Transport.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmTransitLocation
 * Transport.mmTransitLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportDocuments
 * Transport.mmTransportDocuments}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmDepartureTransportParameters
 * Location.mmDepartureTransportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#mmDestinationTransportParameters
 * Location.mmDestinationTransportParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmRelatedTransport
 * Location.mmRelatedTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#mmTransport
 * Document.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#mmTransport
 * Charges.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#mmTransport
 * Incoterms.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods#mmTransport
 * Goods.mmTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
 * ProductDelivery.mmRouting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTransport
 * Packaging.mmTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#mmTransport
 * TransportPartyRole.mmTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmRelatedTransport
 * ShipmentDateRange.mmRelatedTransport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected Incoterms incoterms;
	/**
	 * Specifies the applicable Incoterm and associated location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Incoterms#mmTransport
	 * Incoterms.mmTransport}</li>
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
	public static final MMBusinessAssociationEnd mmIncoterms = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Incoterms.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Incoterms.mmObject();
		}
	};
	protected Max35Text identification;
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Transport.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Packaging packaging;
	/**
	 * Physical packaging of goods for transport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTransport
	 * Packaging.mmTransport}</li>
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
	public static final MMBusinessAssociationEnd mmPackaging = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of goods for transport.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected ISODateTime arrivalDateTime;
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
	public static final MMBusinessAttribute mmArrivalDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ArrivalDateTime";
			definition = "Date and time when the goods reach their destination..";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Transport.class.getMethod("getArrivalDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator partialShipment;
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
	public static final MMBusinessAttribute mmPartialShipment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialShipment";
			definition = "Indicates whether or not partial shipments are allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Transport.class.getMethod("getPartialShipment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator transShipment;
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
	public static final MMBusinessAttribute mmTransShipment = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransShipment";
			definition = "Indicates whether or not transshipment of goods is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Transport.class.getMethod("getTransShipment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ProductDelivery productDelivery;
	/**
	 * Specifies the delivery parameters of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#mmRouting
	 * ProductDelivery.mmRouting}</li>
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
	public static final MMBusinessAssociationEnd mmProductDelivery = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Specifies the delivery parameters of a trade.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmRouting;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
		}
	};
	protected Location placeOfDeparture;
	/**
	 * Place from where the goods must leave.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDepartureTransportParameters
	 * Location.mmDepartureTransportParameters}</li>
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
	public static final MMBusinessAssociationEnd mmPlaceOfDeparture = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDeparture";
			definition = "Place from where the goods must leave.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDepartureTransportParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Location placeOfDestination;
	/**
	 * Place where the goods must arrive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmDestinationTransportParameters
	 * Location.mmDestinationTransportParameters}</li>
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
	public static final MMBusinessAssociationEnd mmPlaceOfDestination = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDestination";
			definition = "Place where the goods must arrive.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmDestinationTransportParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Charges> transportCharges;
	/**
	 * Charges related to the conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmTransport
	 * Charges.mmTransport}</li>
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
	public static final MMBusinessAssociationEnd mmTransportCharges = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransportCharges";
			definition = "Charges related to the conveyance of goods.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Charges.mmObject();
		}
	};
	protected FreightChargesCode freightChargesPrepaidOrCollect;
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
	public static final MMBusinessAttribute mmFreightChargesPrepaidOrCollect = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FreightChargesPrepaidOrCollect";
			definition = "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FreightChargesCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Transport.class.getMethod("getFreightChargesPrepaidOrCollect", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ShipmentDateRange shipmentDates;
	/**
	 * Specifies the shipment date, the earliest shipment date and the latest
	 * shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmRelatedTransport
	 * ShipmentDateRange.mmRelatedTransport}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#mmShipmentAttributes
	 * SupportingDocumentEntry1.mmShipmentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#mmShipmentSchedule
	 * TradeContract1.mmShipmentSchedule}</li>
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
	public static final MMBusinessAssociationEnd mmShipmentDates = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SupportingDocumentEntry1.mmShipmentAttributes, TradeContract1.mmShipmentSchedule);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShipmentDates";
			definition = "Specifies the shipment date, the earliest shipment date and the latest shipment date.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmRelatedTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Goods> transportedGoods;
	/**
	 * Goods that are transported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Goods#mmTransport
	 * Goods.mmTransport}</li>
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
	public static final MMBusinessAssociationEnd mmTransportedGoods = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Goods.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Goods.mmObject();
		}
	};
	protected TransportPartyRole partyRole;
	/**
	 * Specifies each role linked to the transport of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#mmTransport
	 * TransportPartyRole.mmTransport}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the transport of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TransportPartyRole.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransportPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Location> transitLocation;
	/**
	 * Place through which the goods are transiting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmRelatedTransport
	 * Location.mmRelatedTransport}</li>
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
	public static final MMBusinessAssociationEnd mmTransitLocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransitLocation";
			definition = "Place through which the goods are transiting.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmRelatedTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Document transportDocuments;
	/**
	 * Documents which may be required in relation with the transportation of
	 * goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmTransport
	 * Document.mmTransport}</li>
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
	public static final MMBusinessAssociationEnd mmTransportDocuments = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Transport.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransportDocuments";
			definition = "Documents which may be required in relation with the transportation of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Document.mmTransport;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Document.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transport";
				definition = "Moving of goods or people from one place to another by vehicle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.mmDepartureTransportParameters, com.tools20022.repository.entity.Location.mmDestinationTransportParameters,
						com.tools20022.repository.entity.Location.mmRelatedTransport, com.tools20022.repository.entity.Document.mmTransport, com.tools20022.repository.entity.Charges.mmTransport,
						com.tools20022.repository.entity.Incoterms.mmTransport, com.tools20022.repository.entity.Goods.mmTransport, com.tools20022.repository.entity.ProductDelivery.mmRouting,
						com.tools20022.repository.entity.Packaging.mmTransport, com.tools20022.repository.entity.TransportPartyRole.mmTransport, com.tools20022.repository.entity.ShipmentDateRange.mmRelatedTransport);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.mmIncoterms, com.tools20022.repository.entity.Transport.mmIdentification, com.tools20022.repository.entity.Transport.mmPackaging,
						com.tools20022.repository.entity.Transport.mmArrivalDateTime, com.tools20022.repository.entity.Transport.mmPartialShipment, com.tools20022.repository.entity.Transport.mmTransShipment,
						com.tools20022.repository.entity.Transport.mmProductDelivery, com.tools20022.repository.entity.Transport.mmPlaceOfDeparture, com.tools20022.repository.entity.Transport.mmPlaceOfDestination,
						com.tools20022.repository.entity.Transport.mmTransportCharges, com.tools20022.repository.entity.Transport.mmFreightChargesPrepaidOrCollect, com.tools20022.repository.entity.Transport.mmShipmentDates,
						com.tools20022.repository.entity.Transport.mmTransportedGoods, com.tools20022.repository.entity.Transport.mmPartyRole, com.tools20022.repository.entity.Transport.mmTransitLocation,
						com.tools20022.repository.entity.Transport.mmTransportDocuments);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Transport.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Incoterms getIncoterms() {
		return incoterms;
	}

	public void setIncoterms(com.tools20022.repository.entity.Incoterms incoterms) {
		this.incoterms = incoterms;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public void setPackaging(com.tools20022.repository.entity.Packaging packaging) {
		this.packaging = packaging;
	}

	public ISODateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(ISODateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public YesNoIndicator getPartialShipment() {
		return partialShipment;
	}

	public void setPartialShipment(YesNoIndicator partialShipment) {
		this.partialShipment = partialShipment;
	}

	public YesNoIndicator getTransShipment() {
		return transShipment;
	}

	public void setTransShipment(YesNoIndicator transShipment) {
		this.transShipment = transShipment;
	}

	public ProductDelivery getProductDelivery() {
		return productDelivery;
	}

	public void setProductDelivery(com.tools20022.repository.entity.ProductDelivery productDelivery) {
		this.productDelivery = productDelivery;
	}

	public Location getPlaceOfDeparture() {
		return placeOfDeparture;
	}

	public void setPlaceOfDeparture(com.tools20022.repository.entity.Location placeOfDeparture) {
		this.placeOfDeparture = placeOfDeparture;
	}

	public Location getPlaceOfDestination() {
		return placeOfDestination;
	}

	public void setPlaceOfDestination(com.tools20022.repository.entity.Location placeOfDestination) {
		this.placeOfDestination = placeOfDestination;
	}

	public List<Charges> getTransportCharges() {
		return transportCharges;
	}

	public void setTransportCharges(List<com.tools20022.repository.entity.Charges> transportCharges) {
		this.transportCharges = transportCharges;
	}

	public FreightChargesCode getFreightChargesPrepaidOrCollect() {
		return freightChargesPrepaidOrCollect;
	}

	public void setFreightChargesPrepaidOrCollect(FreightChargesCode freightChargesPrepaidOrCollect) {
		this.freightChargesPrepaidOrCollect = freightChargesPrepaidOrCollect;
	}

	public ShipmentDateRange getShipmentDates() {
		return shipmentDates;
	}

	public void setShipmentDates(com.tools20022.repository.entity.ShipmentDateRange shipmentDates) {
		this.shipmentDates = shipmentDates;
	}

	public List<Goods> getTransportedGoods() {
		return transportedGoods;
	}

	public void setTransportedGoods(List<com.tools20022.repository.entity.Goods> transportedGoods) {
		this.transportedGoods = transportedGoods;
	}

	public TransportPartyRole getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(com.tools20022.repository.entity.TransportPartyRole partyRole) {
		this.partyRole = partyRole;
	}

	public List<Location> getTransitLocation() {
		return transitLocation;
	}

	public void setTransitLocation(List<com.tools20022.repository.entity.Location> transitLocation) {
		this.transitLocation = transitLocation;
	}

	public Document getTransportDocuments() {
		return transportDocuments;
	}

	public void setTransportDocuments(com.tools20022.repository.entity.Document transportDocuments) {
		this.transportDocuments = transportDocuments;
	}
}