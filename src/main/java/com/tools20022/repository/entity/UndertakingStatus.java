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
import com.tools20022.repository.codeset.DemandStatusCode;
import com.tools20022.repository.codeset.ExternalUndertakingStatusCategoryCode;
import com.tools20022.repository.codeset.UndertakingStatusCode;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingStatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Status of the undertaking.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="UndertakingStatus" src="doc-files/UndertakingStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertaking
 * UndertakingStatus.mmUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmDemandStatus
 * UndertakingStatus.mmDemandStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UndertakingStatus#mmStatus
 * UndertakingStatus.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmUndertakingStatusReason
 * UndertakingStatus.mmUndertakingStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmStatusCategory
 * UndertakingStatus.mmStatusCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatus#mmPresentationStatus
 * UndertakingStatus.mmPresentationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingStatus
 * Undertaking.mmUndertakingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmUndertakingStatus
 * UndertakingStatusReason.mmUndertakingStatus}</li>
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
 * "UndertakingStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of the undertaking."</li>
 * </ul>
 */
public class UndertakingStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking undertaking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingStatus
	 * Undertaking.mmUndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which a status is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<UndertakingStatus, com.tools20022.repository.entity.Undertaking> mmUndertaking = new MMBusinessAssociationEnd<UndertakingStatus, com.tools20022.repository.entity.Undertaking>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a status is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmUndertakingStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.Undertaking getValue(UndertakingStatus obj) {
			return obj.getUndertaking();
		}

		@Override
		public void setValue(UndertakingStatus obj, com.tools20022.repository.entity.Undertaking value) {
			obj.setUndertaking(value);
		}
	};
	protected DemandStatusCode demandStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DemandStatusCode
	 * DemandStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DemandStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing status reported by the applicant."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<UndertakingStatus, DemandStatusCode> mmDemandStatus = new MMBusinessAttribute<UndertakingStatus, DemandStatusCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DemandStatus";
			definition = "Processing status reported by the applicant.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DemandStatusCode.mmObject();
		}

		@Override
		public DemandStatusCode getValue(UndertakingStatus obj) {
			return obj.getDemandStatus();
		}

		@Override
		public void setValue(UndertakingStatus obj, DemandStatusCode value) {
			obj.setDemandStatus(value);
		}
	};
	protected UndertakingStatusCode status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the undertaking."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<UndertakingStatus, UndertakingStatusCode> mmStatus = new MMBusinessAttribute<UndertakingStatus, UndertakingStatusCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingStatusCode.mmObject();
		}

		@Override
		public UndertakingStatusCode getValue(UndertakingStatus obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(UndertakingStatus obj, UndertakingStatusCode value) {
			obj.setStatus(value);
		}
	};
	protected UndertakingStatusReason undertakingStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatusReason#mmUndertakingStatus
	 * UndertakingStatusReason.mmUndertakingStatus}</li>
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
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the status. it is derived from the association between Status and StatusReason."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<UndertakingStatus, Optional<UndertakingStatusReason>> mmUndertakingStatusReason = new MMBusinessAssociationEnd<UndertakingStatus, Optional<UndertakingStatusReason>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UndertakingStatusReason";
			definition = "Specifies the reason for the status. it is derived from the association between Status and StatusReason.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmUndertakingStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UndertakingStatusReason.mmObject();
		}

		@Override
		public Optional<UndertakingStatusReason> getValue(UndertakingStatus obj) {
			return obj.getUndertakingStatusReason();
		}

		@Override
		public void setValue(UndertakingStatus obj, Optional<UndertakingStatusReason> value) {
			obj.setUndertakingStatusReason(value.orElse(null));
		}
	};
	protected ExternalUndertakingStatusCategoryCode statusCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalUndertakingStatusCategoryCode
	 * ExternalUndertakingStatusCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the status."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<UndertakingStatus, ExternalUndertakingStatusCategoryCode> mmStatusCategory = new MMBusinessAttribute<UndertakingStatus, ExternalUndertakingStatusCategoryCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatusCategory";
			definition = "Specifies the category of the status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalUndertakingStatusCategoryCode.mmObject();
		}

		@Override
		public ExternalUndertakingStatusCategoryCode getValue(UndertakingStatus obj) {
			return obj.getStatusCategory();
		}

		@Override
		public void setValue(UndertakingStatus obj, ExternalUndertakingStatusCategoryCode value) {
			obj.setStatusCategory(value);
		}
	};
	protected UndertakingStatusCode presentationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatusCode
	 * UndertakingStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingStatus
	 * UndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the presentation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<UndertakingStatus, UndertakingStatusCode> mmPresentationStatus = new MMBusinessAttribute<UndertakingStatus, UndertakingStatusCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.UndertakingStatus.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationStatus";
			definition = "Status of the presentation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingStatusCode.mmObject();
		}

		@Override
		public UndertakingStatusCode getValue(UndertakingStatus obj) {
			return obj.getPresentationStatus();
		}

		@Override
		public void setValue(UndertakingStatus obj, UndertakingStatusCode value) {
			obj.setPresentationStatus(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingStatus";
				definition = "Status of the undertaking.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmUndertakingStatus, com.tools20022.repository.entity.UndertakingStatusReason.mmUndertakingStatus);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.UndertakingStatus.mmUndertaking, com.tools20022.repository.entity.UndertakingStatus.mmDemandStatus,
						com.tools20022.repository.entity.UndertakingStatus.mmStatus, com.tools20022.repository.entity.UndertakingStatus.mmUndertakingStatusReason, com.tools20022.repository.entity.UndertakingStatus.mmStatusCategory,
						com.tools20022.repository.entity.UndertakingStatus.mmPresentationStatus);
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public UndertakingStatus setUndertaking(com.tools20022.repository.entity.Undertaking undertaking) {
		this.undertaking = Objects.requireNonNull(undertaking);
		return this;
	}

	public DemandStatusCode getDemandStatus() {
		return demandStatus;
	}

	public UndertakingStatus setDemandStatus(DemandStatusCode demandStatus) {
		this.demandStatus = Objects.requireNonNull(demandStatus);
		return this;
	}

	public UndertakingStatusCode getStatus() {
		return status;
	}

	public UndertakingStatus setStatus(UndertakingStatusCode status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<UndertakingStatusReason> getUndertakingStatusReason() {
		return undertakingStatusReason == null ? Optional.empty() : Optional.of(undertakingStatusReason);
	}

	public UndertakingStatus setUndertakingStatusReason(com.tools20022.repository.entity.UndertakingStatusReason undertakingStatusReason) {
		this.undertakingStatusReason = undertakingStatusReason;
		return this;
	}

	public ExternalUndertakingStatusCategoryCode getStatusCategory() {
		return statusCategory;
	}

	public UndertakingStatus setStatusCategory(ExternalUndertakingStatusCategoryCode statusCategory) {
		this.statusCategory = Objects.requireNonNull(statusCategory);
		return this;
	}

	public UndertakingStatusCode getPresentationStatus() {
		return presentationStatus;
	}

	public UndertakingStatus setPresentationStatus(UndertakingStatusCode presentationStatus) {
		this.presentationStatus = Objects.requireNonNull(presentationStatus);
		return this;
	}
}