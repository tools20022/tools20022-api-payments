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
import com.tools20022.repository.choice.CancellationStatusReason2Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalPaymentInstruction22;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the actions taken as a result of an investigation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestigationResolution"
 * src="doc-files/InvestigationResolution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationResolution#mmInvestigationCase
 * InvestigationResolution.mmInvestigationCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationResolution#mmInvestigationCaseReference
 * InvestigationResolution.mmInvestigationCaseReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmInvestigationResolution
 * InvestigationCase.mmInvestigationResolution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
 * PaymentInvestigationCaseResolution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reassignment Reassignment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DuplicateCase DuplicateCase}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CancellationStatusReason2Choice
 * CancellationStatusReason2Choice}</li>
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
 * "InvestigationResolution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the actions taken as a result of an investigation."</li>
 * </ul>
 */
public class InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestigationCase investigationCase;
	/**
	 * Case for which a resolution is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmInvestigationResolution
	 * InvestigationCase.mmInvestigationResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestigationCase
	 * InvestigationCase}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmResolvedCase
	 * OriginalPaymentInstruction22.mmResolvedCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationResolution
	 * InvestigationResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Case for which a resolution is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestigationCase = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalPaymentInstruction22.mmResolvedCase);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationCase";
			definition = "Case for which a resolution is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmInvestigationResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}
	};
	protected Max35Text investigationCaseReference;
	/**
	 * Identifies the case for which a resolution is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationResolution
	 * InvestigationResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationCaseReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the case for which a resolution is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmInvestigationCaseReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestigationResolution.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestigationCaseReference";
			definition = "Identifies the case for which a resolution is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestigationResolution.class.getMethod("getInvestigationCaseReference", new Class[]{});
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
				name = "InvestigationResolution";
				definition = "Specifies the actions taken as a result of an investigation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.mmInvestigationResolution);
				subType_lazy = () -> Arrays.asList(PaymentInvestigationCaseResolution.mmObject(), Reassignment.mmObject(), DuplicateCase.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationResolution.mmInvestigationCase, com.tools20022.repository.entity.InvestigationResolution.mmInvestigationCaseReference);
				derivationComponent_lazy = () -> Arrays.asList(CancellationStatusReason2Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestigationResolution.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InvestigationCase getInvestigationCase() {
		return investigationCase;
	}

	public void setInvestigationCase(com.tools20022.repository.entity.InvestigationCase investigationCase) {
		this.investigationCase = investigationCase;
	}

	public Max35Text getInvestigationCaseReference() {
		return investigationCaseReference;
	}

	public void setInvestigationCaseReference(Max35Text investigationCaseReference) {
		this.investigationCaseReference = investigationCaseReference;
	}
}