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
import com.tools20022.repository.codeset.CaseForwardingNotificationCode;
import com.tools20022.repository.entity.InvestigationResolution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CaseForwardingNotification3;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Action that consists in forwarding an investigation case assignment to
 * another party which becomes the new assignee.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Reassignment" src="doc-files/Reassignment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestigationResolution
 * InvestigationResolution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reassignment#mmJustification
 * Reassignment.mmJustification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Reassignment#mmReassignedCase
 * Reassignment.mmReassignedCase}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmReassignment
 * InvestigationCase.mmReassignment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CaseForwardingNotification3
 * CaseForwardingNotification3}</li>
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
 * "Reassignment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Action that consists in forwarding an investigation case assignment to another party which becomes the new assignee."
 * </li>
 * </ul>
 */
public class Reassignment extends InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CaseForwardingNotificationCode justification;
	/**
	 * Justification for the forward action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CaseForwardingNotificationCode
	 * CaseForwardingNotificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CaseForwardingNotification3#mmJustification
	 * CaseForwardingNotification3.mmJustification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reassignment Reassignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Justification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Justification for the forward action."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmJustification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CaseForwardingNotification3.mmJustification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reassignment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Justification";
			definition = "Justification for the forward action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CaseForwardingNotificationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Reassignment.class.getMethod("getJustification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestigationCase reassignedCase;
	/**
	 * Specifies the investigation case that is assigned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmReassignment
	 * InvestigationCase.mmReassignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Reassignment Reassignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReassignedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the investigation case that is assigned."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReassignedCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Reassignment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReassignedCase";
			definition = "Specifies the investigation case that is assigned.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmReassignment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reassignment";
				definition = "Action that consists in forwarding an investigation case assignment to another party which becomes the new assignee.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.mmReassignment);
				superType_lazy = () -> InvestigationResolution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Reassignment.mmJustification, com.tools20022.repository.entity.Reassignment.mmReassignedCase);
				derivationComponent_lazy = () -> Arrays.asList(CaseForwardingNotification3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Reassignment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseForwardingNotificationCode getJustification() {
		return justification;
	}

	public void setJustification(CaseForwardingNotificationCode justification) {
		this.justification = justification;
	}

	public InvestigationCase getReassignedCase() {
		return reassignedCase;
	}

	public void setReassignedCase(com.tools20022.repository.entity.InvestigationCase reassignedCase) {
		this.reassignedCase = reassignedCase;
	}
}