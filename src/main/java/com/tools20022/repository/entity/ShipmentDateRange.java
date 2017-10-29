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
import com.tools20022.repository.choice.ShipmentSchedule2Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.ShipmentAttribute1;
import com.tools20022.repository.msg.ShipmentDateRange1;
import com.tools20022.repository.msg.ShipmentDateRange2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies a shipment period or a shipment date.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ShipmentDateRange" src="doc-files/ShipmentDateRange.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#LatestShipmentDate
 * ShipmentDateRange.LatestShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#RelatedTransport
 * ShipmentDateRange.RelatedTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#EarliestShipmentDate
 * ShipmentDateRange.EarliestShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#ShipmentDate
 * ShipmentDateRange.ShipmentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#ShipmentDates
 * Transport.ShipmentDates}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice#ShipmentDateRange
 * ShipmentSchedule2Choice.ShipmentDateRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice#ShipmentSubSchedule
 * ShipmentSchedule2Choice.ShipmentSubSchedule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ShipmentDateRange1
 * ShipmentDateRange1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ShipmentDateRange2
 * ShipmentDateRange2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice
 * ShipmentSchedule2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ShipmentAttribute1
 * ShipmentAttribute1}</li>
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
 * "ShipmentDateRange"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a shipment period or a shipment date."</li>
 * </ul>
 */
public class ShipmentDateRange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Latest date whereby the goods must be shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange1#LatestShipmentDate
	 * ShipmentDateRange1.LatestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#LatestShipmentDate
	 * ShipmentDateRange2.LatestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#ExpectedDate
	 * ShipmentAttribute1.ExpectedDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatestShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Latest date whereby the goods must be shipped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LatestShipmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ShipmentDateRange1.LatestShipmentDate, com.tools20022.repository.msg.ShipmentDateRange2.LatestShipmentDate,
					com.tools20022.repository.msg.ShipmentAttribute1.ExpectedDate);
			elementContext_lazy = () -> ShipmentDateRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LatestShipmentDate";
			definition = "Latest date whereby the goods must be shipped.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the transport process to which the dates apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#ShipmentDates
	 * Transport.ShipmentDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Transport Transport}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the transport process to which the dates apply."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedTransport = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ShipmentDateRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTransport";
			definition = "Specifies the transport process to which the dates apply.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Transport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Transport.ShipmentDates;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Earliest date whereby the items must be shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange1#EarliestShipmentDate
	 * ShipmentDateRange1.EarliestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#EarliestShipmentDate
	 * ShipmentDateRange2.EarliestShipmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Earliest date whereby the items must be shipped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EarliestShipmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ShipmentDateRange1.EarliestShipmentDate, com.tools20022.repository.msg.ShipmentDateRange2.EarliestShipmentDate);
			elementContext_lazy = () -> ShipmentDateRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarliestShipmentDate";
			definition = "Earliest date whereby the items must be shipped.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date at which the goods are shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#ExpectedShipmentDate
	 * TransactionCertificateContract1.ExpectedShipmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the goods are shipped."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ShipmentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionCertificateContract1.ExpectedShipmentDate);
			elementContext_lazy = () -> ShipmentDateRange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShipmentDate";
			definition = "Date at which the goods are shipped.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ShipmentDateRange";
				definition = "Specifies a shipment period or a shipment date.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.ShipmentDates);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ShipmentSchedule2Choice.ShipmentDateRange, com.tools20022.repository.choice.ShipmentSchedule2Choice.ShipmentSubSchedule);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ShipmentDateRange.LatestShipmentDate, com.tools20022.repository.entity.ShipmentDateRange.RelatedTransport,
						com.tools20022.repository.entity.ShipmentDateRange.EarliestShipmentDate, com.tools20022.repository.entity.ShipmentDateRange.ShipmentDate);
				derivationComponent_lazy = () -> Arrays.asList(ShipmentDateRange1.mmObject(), ShipmentDateRange2.mmObject(), ShipmentSchedule2Choice.mmObject(), ShipmentAttribute1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}