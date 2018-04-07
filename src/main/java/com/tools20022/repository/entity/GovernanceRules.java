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
import com.tools20022.repository.codeset.GovernanceIdentificationCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Jurisdiction;
import com.tools20022.repository.entity.ModelForm;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Rules governing an undertaking such as a guarantee or standby letter of
 * credit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="GovernanceRules" src="doc-files/GovernanceRules.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.GovernanceRules#mmModelForm
 * GovernanceRules.mmModelForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmIdentification
 * GovernanceRules.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmApplicableLaw
 * GovernanceRules.mmApplicableLaw}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmJurisdiction
 * GovernanceRules.mmJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmPublicationAgency
 * GovernanceRules.mmPublicationAgency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ModelForm#mmGovernanceRules
 * ModelForm.mmGovernanceRules}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmGovernanceRules
 * Jurisdiction.mmGovernanceRules}</li>
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
 * "GovernanceRules"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rules governing an undertaking such as a guarantee or standby letter of credit."
 * </li>
 * </ul>
 */
public class GovernanceRules {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ModelForm modelForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ModelForm#mmGovernanceRules
	 * ModelForm.mmGovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ModelForm ModelForm}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules
	 * GovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModelForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Model form to which the governance rules apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GovernanceRules, ModelForm> mmModelForm = new MMBusinessAssociationEnd<GovernanceRules, ModelForm>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModelForm";
			definition = "Model form to which the governance rules apply.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> ModelForm.mmGovernanceRules;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ModelForm.mmObject();
		}

		@Override
		public ModelForm getValue(GovernanceRules obj) {
			return obj.getModelForm();
		}

		@Override
		public void setValue(GovernanceRules obj, ModelForm value) {
			obj.setModelForm(value);
		}
	};
	protected GovernanceIdentificationCode identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode
	 * GovernanceIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules
	 * GovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the governance rules."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<GovernanceRules, GovernanceIdentificationCode> mmIdentification = new MMBusinessAttribute<GovernanceRules, GovernanceIdentificationCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the governance rules.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GovernanceIdentificationCode.mmObject();
		}

		@Override
		public GovernanceIdentificationCode getValue(GovernanceRules obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(GovernanceRules obj, GovernanceIdentificationCode value) {
			obj.setIdentification(value);
		}
	};
	protected Max35Text applicableLaw;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules
	 * GovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableLaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Law under which the undertaking has been issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<GovernanceRules, Max35Text> mmApplicableLaw = new MMBusinessAttribute<GovernanceRules, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableLaw";
			definition = "Law under which the undertaking has been issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(GovernanceRules obj) {
			return obj.getApplicableLaw();
		}

		@Override
		public void setValue(GovernanceRules obj, Max35Text value) {
			obj.setApplicableLaw(value);
		}
	};
	protected Jurisdiction jurisdiction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmGovernanceRules
	 * Jurisdiction.mmGovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules
	 * GovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Jurisdiction which applies to the governance rules."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<GovernanceRules, Jurisdiction> mmJurisdiction = new MMBusinessAssociationEnd<GovernanceRules, Jurisdiction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction which applies to the governance rules.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Jurisdiction.mmGovernanceRules;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Jurisdiction.mmObject();
		}

		@Override
		public Jurisdiction getValue(GovernanceRules obj) {
			return obj.getJurisdiction();
		}

		@Override
		public void setValue(GovernanceRules obj, Jurisdiction value) {
			obj.setJurisdiction(value);
		}
	};
	protected Max35Text publicationAgency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules
	 * GovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicationAgency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agency that publishes the governance rules."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<GovernanceRules, Max35Text> mmPublicationAgency = new MMBusinessAttribute<GovernanceRules, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicationAgency";
			definition = "Agency that publishes the governance rules.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(GovernanceRules obj) {
			return obj.getPublicationAgency();
		}

		@Override
		public void setValue(GovernanceRules obj, Max35Text value) {
			obj.setPublicationAgency(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GovernanceRules";
				definition = "Rules governing an undertaking such as a guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(ModelForm.mmGovernanceRules, Jurisdiction.mmGovernanceRules);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GovernanceRules.mmModelForm, com.tools20022.repository.entity.GovernanceRules.mmIdentification,
						com.tools20022.repository.entity.GovernanceRules.mmApplicableLaw, com.tools20022.repository.entity.GovernanceRules.mmJurisdiction, com.tools20022.repository.entity.GovernanceRules.mmPublicationAgency);
			}

			@Override
			public Class<?> getInstanceClass() {
				return GovernanceRules.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ModelForm getModelForm() {
		return modelForm;
	}

	public GovernanceRules setModelForm(ModelForm modelForm) {
		this.modelForm = Objects.requireNonNull(modelForm);
		return this;
	}

	public GovernanceIdentificationCode getIdentification() {
		return identification;
	}

	public GovernanceRules setIdentification(GovernanceIdentificationCode identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Max35Text getApplicableLaw() {
		return applicableLaw;
	}

	public GovernanceRules setApplicableLaw(Max35Text applicableLaw) {
		this.applicableLaw = Objects.requireNonNull(applicableLaw);
		return this;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public GovernanceRules setJurisdiction(Jurisdiction jurisdiction) {
		this.jurisdiction = Objects.requireNonNull(jurisdiction);
		return this;
	}

	public Max35Text getPublicationAgency() {
		return publicationAgency;
	}

	public GovernanceRules setPublicationAgency(Max35Text publicationAgency) {
		this.publicationAgency = Objects.requireNonNull(publicationAgency);
		return this;
	}
}