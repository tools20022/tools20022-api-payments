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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.InvestigationResolution;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Outcome that results in closing a case as duplicate because the same issue
 * has been reported by another party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DuplicateCase" src="doc-files/DuplicateCase.svg">
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
 * {@linkplain com.tools20022.repository.entity.DuplicateCase#mmDuplicatedCase
 * DuplicateCase.mmDuplicatedCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DuplicateCase#mmRelatedCaseResolution
 * DuplicateCase.mmRelatedCaseResolution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmDuplicateCaseResolution
 * InvestigationCase.mmDuplicateCaseResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmDuplicateCase
 * PaymentInvestigationCaseResolution.mmDuplicateCase}</li>
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
 * "DuplicateCase"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Outcome that results in closing a case as duplicate because the same issue has been reported by another party."
 * </li>
 * </ul>
 */
public class DuplicateCase extends InvestigationResolution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.InvestigationCase> duplicatedCase;
	/**
	 * Identifies the original case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmDuplicateCaseResolution
	 * InvestigationCase.mmDuplicateCaseResolution}</li>
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
	 * {@linkplain com.tools20022.repository.entity.DuplicateCase DuplicateCase}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicatedCase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the original case."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDuplicatedCase = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DuplicatedCase";
			definition = "Identifies the original case.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmDuplicateCaseResolution;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestigationCase.mmObject();
		}
	};
	protected PaymentInvestigationCaseResolution relatedCaseResolution;
	/**
	 * Investigation case information which is duplicate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution#mmDuplicateCase
	 * PaymentInvestigationCaseResolution.mmDuplicateCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInvestigationCaseResolution
	 * PaymentInvestigationCaseResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DuplicateCase DuplicateCase}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCaseResolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investigation case information which is duplicate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCaseResolution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DuplicateCase.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCaseResolution";
			definition = "Investigation case information which is duplicate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmDuplicateCase;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DuplicateCase";
				definition = "Outcome that results in closing a case as duplicate because the same issue has been reported by another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestigationCase.mmDuplicateCaseResolution, com.tools20022.repository.entity.PaymentInvestigationCaseResolution.mmDuplicateCase);
				superType_lazy = () -> InvestigationResolution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DuplicateCase.mmDuplicatedCase, com.tools20022.repository.entity.DuplicateCase.mmRelatedCaseResolution);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DuplicateCase.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<InvestigationCase> getDuplicatedCase() {
		return duplicatedCase;
	}

	public void setDuplicatedCase(List<com.tools20022.repository.entity.InvestigationCase> duplicatedCase) {
		this.duplicatedCase = duplicatedCase;
	}

	public PaymentInvestigationCaseResolution getRelatedCaseResolution() {
		return relatedCaseResolution;
	}

	public void setRelatedCaseResolution(com.tools20022.repository.entity.PaymentInvestigationCaseResolution relatedCaseResolution) {
		this.relatedCaseResolution = relatedCaseResolution;
	}
}