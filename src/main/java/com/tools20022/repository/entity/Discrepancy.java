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
import com.tools20022.repository.codeset.ExternalDiscrepancyCode;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.entity.UndertakingStatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Identification of a discrepancy.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Discrepancy" src="doc-files/Discrepancy.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discrepancy#mmUndertakingStatusReason
 * Discrepancy.mmUndertakingStatusReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discrepancy#mmType
 * Discrepancy.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discrepancy#mmDescription
 * Discrepancy.mmDescription}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmDiscrepancy
 * UndertakingStatusReason.mmDiscrepancy}</li>
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
 * "Discrepancy"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a discrepancy."</li>
 * </ul>
 */
public class Discrepancy {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected UndertakingStatusReason undertakingStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmDiscrepancy
	 * UndertakingStatusReason.mmDiscrepancy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason
	 * UndertakingStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discrepancy Discrepancy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking status reason for which discrepancy information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Discrepancy, UndertakingStatusReason> mmUndertakingStatusReason = new MMBusinessAssociationEnd<Discrepancy, UndertakingStatusReason>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discrepancy.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatusReason";
			definition = "Undertaking status reason for which discrepancy information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> UndertakingStatusReason.mmDiscrepancy;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UndertakingStatusReason.mmObject();
		}

		@Override
		public UndertakingStatusReason getValue(Discrepancy obj) {
			return obj.getUndertakingStatusReason();
		}

		@Override
		public void setValue(Discrepancy obj, UndertakingStatusReason value) {
			obj.setUndertakingStatusReason(value);
		}
	};
	protected ExternalDiscrepancyCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalDiscrepancyCode
	 * ExternalDiscrepancyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discrepancy Discrepancy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of discrepancy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discrepancy, ExternalDiscrepancyCode> mmType = new MMBusinessAttribute<Discrepancy, ExternalDiscrepancyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discrepancy.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of discrepancy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalDiscrepancyCode.mmObject();
		}

		@Override
		public ExternalDiscrepancyCode getValue(Discrepancy obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Discrepancy obj, ExternalDiscrepancyCode value) {
			obj.setType(value);
		}
	};
	protected Max2000Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discrepancy Discrepancy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the discrepancy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discrepancy, Max2000Text> mmDescription = new MMBusinessAttribute<Discrepancy, Max2000Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discrepancy.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Description of the discrepancy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Max2000Text getValue(Discrepancy obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(Discrepancy obj, Max2000Text value) {
			obj.setDescription(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Discrepancy";
				definition = "Identification of a discrepancy.";
				associationDomain_lazy = () -> Arrays.asList(UndertakingStatusReason.mmDiscrepancy);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Discrepancy.mmUndertakingStatusReason, com.tools20022.repository.entity.Discrepancy.mmType, com.tools20022.repository.entity.Discrepancy.mmDescription);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Discrepancy.class;
			}
		});
		return mmObject_lazy.get();
	}

	public UndertakingStatusReason getUndertakingStatusReason() {
		return undertakingStatusReason;
	}

	public Discrepancy setUndertakingStatusReason(UndertakingStatusReason undertakingStatusReason) {
		this.undertakingStatusReason = Objects.requireNonNull(undertakingStatusReason);
		return this;
	}

	public ExternalDiscrepancyCode getType() {
		return type;
	}

	public Discrepancy setType(ExternalDiscrepancyCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max2000Text getDescription() {
		return description;
	}

	public Discrepancy setDescription(Max2000Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}
}