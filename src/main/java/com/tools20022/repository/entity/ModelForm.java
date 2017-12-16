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
import com.tools20022.repository.codeset.ExternalModelFormIdentificationCode;
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of a model form.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ModelForm" src="doc-files/ModelForm.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ModelForm#mmGovernanceRules
 * ModelForm.mmGovernanceRules}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ModelForm#mmUndertaking
 * ModelForm.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ModelForm#mmIdentification
 * ModelForm.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ModelForm#mmVersion
 * ModelForm.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ModelForm#mmRequestedWordingLanguage
 * ModelForm.mmRequestedWordingLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ModelForm#mmEffectiveDate
 * ModelForm.mmEffectiveDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#mmModelForm
 * Undertaking.mmModelForm}</li>
 * <li>{@linkplain com.tools20022.repository.entity.GovernanceRules#mmModelForm
 * GovernanceRules.mmModelForm}</li>
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
 * "ModelForm"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a model form."</li>
 * </ul>
 */
public class ModelForm {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected GovernanceRules governanceRules;
	/**
	 * Rules governing an undertaking such as a guarantee or standby letter of
	 * credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GovernanceRules#mmModelForm
	 * GovernanceRules.mmModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.GovernanceRules
	 * GovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ModelForm
	 * ModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernanceRules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rules governing an undertaking such as a guarantee or standby letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGovernanceRules = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GovernanceRules";
			definition = "Rules governing an undertaking such as a guarantee or standby letter of credit.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmModelForm;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GovernanceRules.mmObject();
		}
	};
	protected Undertaking undertaking;
	/**
	 * Undertaking for which the model form is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmModelForm
	 * Undertaking.mmModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ModelForm
	 * ModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which the model form is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertaking = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which the model form is used.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmModelForm;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected ExternalModelFormIdentificationCode identification;
	/**
	 * Identification of the model form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalModelFormIdentificationCode
	 * ExternalModelFormIdentificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ModelForm
	 * ModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the model form."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the model form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalModelFormIdentificationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ModelForm.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text version;
	/**
	 * Version of the model form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ModelForm
	 * ModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the model form."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVersion = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Version";
			definition = "Version of the model form.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ModelForm.class.getMethod("getVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISO2ALanguageCode requestedWordingLanguage;
	/**
	 * Language of the standard wording provided by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ModelForm
	 * ModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedWordingLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language of the standard wording provided by the issuer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRequestedWordingLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedWordingLanguage";
			definition = "Language of the standard wording provided by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ModelForm.class.getMethod("getRequestedWordingLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate effectiveDate;
	/**
	 * Date on which the use of the model form is effective.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.ModelForm
	 * ModelForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the use of the model form is effective."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEffectiveDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ModelForm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDate";
			definition = "Date on which the use of the model form is effective.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ModelForm.class.getMethod("getEffectiveDate", new Class[]{});
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
				name = "ModelForm";
				definition = "Identification of a model form.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmModelForm, com.tools20022.repository.entity.GovernanceRules.mmModelForm);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ModelForm.mmGovernanceRules, com.tools20022.repository.entity.ModelForm.mmUndertaking, com.tools20022.repository.entity.ModelForm.mmIdentification,
						com.tools20022.repository.entity.ModelForm.mmVersion, com.tools20022.repository.entity.ModelForm.mmRequestedWordingLanguage, com.tools20022.repository.entity.ModelForm.mmEffectiveDate);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ModelForm.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GovernanceRules getGovernanceRules() {
		return governanceRules;
	}

	public void setGovernanceRules(com.tools20022.repository.entity.GovernanceRules governanceRules) {
		this.governanceRules = governanceRules;
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public void setUndertaking(com.tools20022.repository.entity.Undertaking undertaking) {
		this.undertaking = undertaking;
	}

	public ExternalModelFormIdentificationCode getIdentification() {
		return identification;
	}

	public void setIdentification(ExternalModelFormIdentificationCode identification) {
		this.identification = identification;
	}

	public Max35Text getVersion() {
		return version;
	}

	public void setVersion(Max35Text version) {
		this.version = version;
	}

	public ISO2ALanguageCode getRequestedWordingLanguage() {
		return requestedWordingLanguage;
	}

	public void setRequestedWordingLanguage(ISO2ALanguageCode requestedWordingLanguage) {
		this.requestedWordingLanguage = requestedWordingLanguage;
	}

	public ISODate getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(ISODate effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
}