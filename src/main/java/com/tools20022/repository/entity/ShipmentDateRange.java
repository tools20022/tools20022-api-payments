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
import com.tools20022.repository.choice.ShipmentSchedule2Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ShipmentAttribute1;
import com.tools20022.repository.msg.ShipmentDateRange1;
import com.tools20022.repository.msg.ShipmentDateRange2;
import com.tools20022.repository.msg.TransactionCertificateContract1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmLatestShipmentDate
 * ShipmentDateRange.mmLatestShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmRelatedTransport
 * ShipmentDateRange.mmRelatedTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmEarliestShipmentDate
 * ShipmentDateRange.mmEarliestShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmShipmentDate
 * ShipmentDateRange.mmShipmentDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
 * Transport.mmShipmentDates}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice#mmShipmentDateRange
 * ShipmentSchedule2Choice.mmShipmentDateRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ShipmentSchedule2Choice#mmShipmentSubSchedule
 * ShipmentSchedule2Choice.mmShipmentSubSchedule}</li>
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
	protected ISODateTime latestShipmentDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange1#mmLatestShipmentDate
	 * ShipmentDateRange1.mmLatestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#mmLatestShipmentDate
	 * ShipmentDateRange2.mmLatestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentAttribute1#mmExpectedDate
	 * ShipmentAttribute1.mmExpectedDate}</li>
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
	public static final MMBusinessAttribute<ShipmentDateRange, ISODateTime> mmLatestShipmentDate = new MMBusinessAttribute<ShipmentDateRange, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(ShipmentDateRange1.mmLatestShipmentDate, ShipmentDateRange2.mmLatestShipmentDate, ShipmentAttribute1.mmExpectedDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LatestShipmentDate";
			definition = "Latest date whereby the goods must be shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ShipmentDateRange obj) {
			return obj.getLatestShipmentDate();
		}

		@Override
		public void setValue(ShipmentDateRange obj, ISODateTime value) {
			obj.setLatestShipmentDate(value);
		}
	};
	protected Transport relatedTransport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
	 * Transport.mmShipmentDates}</li>
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
	public static final MMBusinessAssociationEnd<ShipmentDateRange, Optional<Transport>> mmRelatedTransport = new MMBusinessAssociationEnd<ShipmentDateRange, Optional<Transport>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTransport";
			definition = "Specifies the transport process to which the dates apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Transport.mmShipmentDates;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Transport.mmObject();
		}

		@Override
		public Optional<Transport> getValue(ShipmentDateRange obj) {
			return obj.getRelatedTransport();
		}

		@Override
		public void setValue(ShipmentDateRange obj, Optional<Transport> value) {
			obj.setRelatedTransport(value.orElse(null));
		}
	};
	protected ISODateTime earliestShipmentDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange1#mmEarliestShipmentDate
	 * ShipmentDateRange1.mmEarliestShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ShipmentDateRange2#mmEarliestShipmentDate
	 * ShipmentDateRange2.mmEarliestShipmentDate}</li>
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
	public static final MMBusinessAttribute<ShipmentDateRange, ISODateTime> mmEarliestShipmentDate = new MMBusinessAttribute<ShipmentDateRange, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(ShipmentDateRange1.mmEarliestShipmentDate, ShipmentDateRange2.mmEarliestShipmentDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarliestShipmentDate";
			definition = "Earliest date whereby the items must be shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ShipmentDateRange obj) {
			return obj.getEarliestShipmentDate();
		}

		@Override
		public void setValue(ShipmentDateRange obj, ISODateTime value) {
			obj.setEarliestShipmentDate(value);
		}
	};
	protected ISODateTime shipmentDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransactionCertificateContract1#mmExpectedShipmentDate
	 * TransactionCertificateContract1.mmExpectedShipmentDate}</li>
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
	public static final MMBusinessAttribute<ShipmentDateRange, ISODateTime> mmShipmentDate = new MMBusinessAttribute<ShipmentDateRange, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionCertificateContract1.mmExpectedShipmentDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShipmentDate";
			definition = "Date at which the goods are shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(ShipmentDateRange obj) {
			return obj.getShipmentDate();
		}

		@Override
		public void setValue(ShipmentDateRange obj, ISODateTime value) {
			obj.setShipmentDate(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShipmentDateRange";
				definition = "Specifies a shipment period or a shipment date.";
				associationDomain_lazy = () -> Arrays.asList(Transport.mmShipmentDates);
				derivationElement_lazy = () -> Arrays.asList(ShipmentSchedule2Choice.mmShipmentDateRange, ShipmentSchedule2Choice.mmShipmentSubSchedule);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ShipmentDateRange.mmLatestShipmentDate, com.tools20022.repository.entity.ShipmentDateRange.mmRelatedTransport,
						com.tools20022.repository.entity.ShipmentDateRange.mmEarliestShipmentDate, com.tools20022.repository.entity.ShipmentDateRange.mmShipmentDate);
				derivationComponent_lazy = () -> Arrays.asList(ShipmentDateRange1.mmObject(), ShipmentDateRange2.mmObject(), ShipmentSchedule2Choice.mmObject(), ShipmentAttribute1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ShipmentDateRange.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getLatestShipmentDate() {
		return latestShipmentDate;
	}

	public ShipmentDateRange setLatestShipmentDate(ISODateTime latestShipmentDate) {
		this.latestShipmentDate = Objects.requireNonNull(latestShipmentDate);
		return this;
	}

	public Optional<Transport> getRelatedTransport() {
		return relatedTransport == null ? Optional.empty() : Optional.of(relatedTransport);
	}

	public ShipmentDateRange setRelatedTransport(Transport relatedTransport) {
		this.relatedTransport = relatedTransport;
		return this;
	}

	public ISODateTime getEarliestShipmentDate() {
		return earliestShipmentDate;
	}

	public ShipmentDateRange setEarliestShipmentDate(ISODateTime earliestShipmentDate) {
		this.earliestShipmentDate = Objects.requireNonNull(earliestShipmentDate);
		return this;
	}

	public ISODateTime getShipmentDate() {
		return shipmentDate;
	}

	public ShipmentDateRange setShipmentDate(ISODateTime shipmentDate) {
		this.shipmentDate = Objects.requireNonNull(shipmentDate);
		return this;
	}
}