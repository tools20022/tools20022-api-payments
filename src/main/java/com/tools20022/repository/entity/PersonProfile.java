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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information to support Know Your Customer (KYC) processes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PersonProfile" src="doc-files/PersonProfile.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#ForeignStatusCertification
 * PersonProfile.ForeignStatusCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#EmployeeTerminationIndicator
 * PersonProfile.EmployeeTerminationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#KnowYourCustomerCheckType
 * PersonProfile.KnowYourCustomerCheckType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#RiskLevel
 * PersonProfile.RiskLevel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#Person
 * PersonProfile.Person}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#PoliticalExposureType
 * PersonProfile.PoliticalExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#CustomerConductClassification
 * PersonProfile.CustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#FamilyMedicalInsuranceIndicator
 * PersonProfile.FamilyMedicalInsuranceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#ProfileCertification
 * PersonProfile.ProfileCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#SourceOfWealth
 * PersonProfile.SourceOfWealth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#SalaryRange
 * PersonProfile.SalaryRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#PersonProfile
 * Person.PersonProfile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate#Person
 * PrivateCertificate.Person}</li>
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
 * "PersonProfile"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information to support Know Your Customer (KYC) processes."</li>
 * </ul>
 */
public class PersonProfile {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies if documentary evidence has been provided for the foreign
	 * resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ProvidedCode
	 * ProvidedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignStatusCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if documentary evidence has been provided for the foreign resident."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ForeignStatusCertification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignStatusCertification";
			definition = "Specifies if documentary evidence has been provided for the foreign resident.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProvidedCode.mmObject();
		}
	};
	/**
	 * Indicates if the employment of the person has been terminated.
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
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#EmployeeTerminationIndicator
	 * Garnishment1.EmployeeTerminationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeTerminationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the employment of the person has been terminated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EmployeeTerminationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.EmployeeTerminationIndicator);
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployeeTerminationIndicator";
			definition = "Indicates if the employment of the person has been terminated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the type of due diligence checks carried out on a party. For
	 * definitions of ordinary, simple and enhanced know your customer checks,
	 * local market regulations should be consulted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode
	 * KnowYourCustomerCheckTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerCheckType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of due diligence checks carried out on a party. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute KnowYourCustomerCheckType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "KnowYourCustomerCheckType";
			definition = "Specifies the type of due diligence checks carried out on a party. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the customer’s money laundering risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RiskLevelCode
	 * RiskLevelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the customer’s money laundering risk."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RiskLevel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RiskLevel";
			definition = "Specifies the customer’s money laundering risk.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RiskLevelCode.mmObject();
		}
	};
	/**
	 * Person for which the profile parameters are described.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#PersonProfile
	 * Person.PersonProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person for which the profile parameters are described."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Person for which the profile parameters are described.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Person.PersonProfile;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies if due diligence checks on the political exposure of the
	 * investor have been carried out and whether these checks are national or
	 * foreign. (A politically exposed person is someone who has been entrusted
	 * with a prominent public function, or an individual who is closely related
	 * to such a person.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureTypeCode
	 * PoliticalExposureTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoliticalExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if due diligence checks on the political exposure of the investor have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PoliticalExposureType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoliticalExposureType";
			definition = "Specifies if due diligence checks on the political exposure of the investor have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PoliticalExposureTypeCode.mmObject();
		}
	};
	/**
	 * Assessment of the customer’s behaviour at the time of the account opening
	 * application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConductClassificationCode
	 * ConductClassificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConductClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assessment of the customer’s behaviour at the time of the account opening application."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CustomerConductClassification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerConductClassification";
			definition = "Assessment of the customer’s behaviour at the time of the account opening application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ConductClassificationCode.mmObject();
		}
	};
	/**
	 * Indicates if the person has family medical insurance coverage available.
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
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#FamilyMedicalInsuranceIndicator
	 * Garnishment1.FamilyMedicalInsuranceIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FamilyMedicalInsuranceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the person has family medical insurance coverage available. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FamilyMedicalInsuranceIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.FamilyMedicalInsuranceIndicator);
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FamilyMedicalInsuranceIndicator";
			definition = "Indicates if the person has family medical insurance coverage available. ";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information to support the Know Your Customer processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#Person
	 * PrivateCertificate.Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information to support the Know Your Customer processes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProfileCertification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProfileCertification";
			definition = "Information to support the Know Your Customer processes.";
			minOccurs = 0;
			type_lazy = () -> PrivateCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.Person;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the main sources of the money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfWealth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the main sources of the money."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SourceOfWealth = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfWealth";
			definition = "Indicates the main sources of the money.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Specifies the level of salary.
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
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the level of salary."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SalaryRange = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SalaryRange";
			definition = "Specifies the level of salary.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PersonProfile";
				definition = "Information to support Know Your Customer (KYC) processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.PersonProfile, com.tools20022.repository.entity.PrivateCertificate.Person);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonProfile.ForeignStatusCertification, com.tools20022.repository.entity.PersonProfile.EmployeeTerminationIndicator,
						com.tools20022.repository.entity.PersonProfile.KnowYourCustomerCheckType, com.tools20022.repository.entity.PersonProfile.RiskLevel, com.tools20022.repository.entity.PersonProfile.Person,
						com.tools20022.repository.entity.PersonProfile.PoliticalExposureType, com.tools20022.repository.entity.PersonProfile.CustomerConductClassification,
						com.tools20022.repository.entity.PersonProfile.FamilyMedicalInsuranceIndicator, com.tools20022.repository.entity.PersonProfile.ProfileCertification, com.tools20022.repository.entity.PersonProfile.SourceOfWealth,
						com.tools20022.repository.entity.PersonProfile.SalaryRange);
			}
		});
		return mmObject_lazy.get();
	}
}