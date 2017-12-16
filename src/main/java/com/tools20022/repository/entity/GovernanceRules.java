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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Model form to which the governance rules apply.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmModelForm = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ModelForm";
			definition = "Model form to which the governance rules apply.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ModelForm.mmGovernanceRules;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
		}
	};
	protected GovernanceIdentificationCode identification;
	/**
	 * Identification of the governance rules.
	 * <p>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return GovernanceRules.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text applicableLaw;
	/**
	 * Law under which the undertaking has been issued.
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
	public static final MMBusinessAttribute mmApplicableLaw = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return GovernanceRules.class.getMethod("getApplicableLaw", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Jurisdiction jurisdiction;
	/**
	 * Jurisdiction which applies to the governance rules.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction which applies to the governance rules.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmGovernanceRules;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};
	protected Max35Text publicationAgency;
	/**
	 * Agency that publishes the governance rules.
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
	public static final MMBusinessAttribute mmPublicationAgency = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return GovernanceRules.class.getMethod("getPublicationAgency", new Class[]{});
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
				name = "GovernanceRules";
				definition = "Rules governing an undertaking such as a guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ModelForm.mmGovernanceRules, com.tools20022.repository.entity.Jurisdiction.mmGovernanceRules);
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

	public void setModelForm(com.tools20022.repository.entity.ModelForm modelForm) {
		this.modelForm = modelForm;
	}

	public GovernanceIdentificationCode getIdentification() {
		return identification;
	}

	public void setIdentification(GovernanceIdentificationCode identification) {
		this.identification = identification;
	}

	public Max35Text getApplicableLaw() {
		return applicableLaw;
	}

	public void setApplicableLaw(Max35Text applicableLaw) {
		this.applicableLaw = applicableLaw;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(com.tools20022.repository.entity.Jurisdiction jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public Max35Text getPublicationAgency() {
		return publicationAgency;
	}

	public void setPublicationAgency(Max35Text publicationAgency) {
		this.publicationAgency = publicationAgency;
	}
}