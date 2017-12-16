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
import com.tools20022.repository.codeset.ExternalCode;
import com.tools20022.repository.codeset.ExternalMandateReason1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AcceptanceResult6;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies whether a mandate is accepted or rejected.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="MandateStatus" src="doc-files/MandateStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus#mmAccepted
 * MandateStatus.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MandateStatus#mmRejectReason
 * MandateStatus.mmRejectReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MandateStatus#mmMandate
 * MandateStatus.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.MandateStatus#mmMandateReason
 * MandateStatus.mmMandateReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmMandateStatus
 * Mandate.mmMandateStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptanceResult6
 * AcceptanceResult6}</li>
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
 * "MandateStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether a mandate is accepted or rejected."</li>
 * </ul>
 */
public class MandateStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator accepted;
	/**
	 * Indicates whether the mandate request was accepted or rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6#mmAccepted
	 * AcceptanceResult6.mmAccepted}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MandateStatus MandateStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the mandate request was accepted or rejected."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAccepted = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptanceResult6.mmAccepted);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Accepted";
			definition = "Indicates whether the mandate request was accepted or rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MandateStatus.class.getMethod("getAccepted", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExternalCode rejectReason;
	/**
	 * Specifies the reason for the rejection of a mandate request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ExternalCode
	 * ExternalCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6#mmRejectReason
	 * AcceptanceResult6.mmRejectReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MandateStatus MandateStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the rejection of a mandate request."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRejectReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AcceptanceResult6.mmRejectReason);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RejectReason";
			definition = "Specifies the reason for the rejection of a mandate request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MandateStatus.class.getMethod("getRejectReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Mandate mandate;
	/**
	 * Mandate for which a status applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateStatus
	 * Mandate.mmMandateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MandateStatus MandateStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mandate for which a status applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMandate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Mandate for which a status applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Mandate.mmMandateStatus;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Mandate.mmObject();
		}
	};
	protected ExternalMandateReason1Code mandateReason;
	/**
	 * Specifies the reason for the request or status of a mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalMandateReason1Code
	 * ExternalMandateReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.MandateStatus MandateStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the request or status of a mandate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMandateReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.MandateStatus.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MandateReason";
			definition = "Specifies the reason for the request or status of a mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalMandateReason1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MandateStatus.class.getMethod("getMandateReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateStatus";
				definition = "Specifies whether a mandate is accepted or rejected.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Mandate.mmMandateStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.MandateStatus.mmAccepted, com.tools20022.repository.entity.MandateStatus.mmRejectReason, com.tools20022.repository.entity.MandateStatus.mmMandate,
						com.tools20022.repository.entity.MandateStatus.mmMandateReason);
				derivationComponent_lazy = () -> Arrays.asList(AcceptanceResult6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return MandateStatus.class;
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getAccepted() {
		return accepted;
	}

	public void setAccepted(YesNoIndicator accepted) {
		this.accepted = accepted;
	}

	public ExternalCode getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(ExternalCode rejectReason) {
		this.rejectReason = rejectReason;
	}

	public Mandate getMandate() {
		return mandate;
	}

	public void setMandate(com.tools20022.repository.entity.Mandate mandate) {
		this.mandate = mandate;
	}

	public ExternalMandateReason1Code getMandateReason() {
		return mandateReason;
	}

	public void setMandateReason(ExternalMandateReason1Code mandateReason) {
		this.mandateReason = mandateReason;
	}
}