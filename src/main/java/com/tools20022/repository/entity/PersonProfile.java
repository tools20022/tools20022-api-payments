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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.entity.PrivateCertificate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Garnishment1;
import com.tools20022.repository.msg.Garnishment2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmForeignStatusCertification
 * PersonProfile.mmForeignStatusCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmEmployeeTerminationIndicator
 * PersonProfile.mmEmployeeTerminationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmKnowYourCustomerCheckType
 * PersonProfile.mmKnowYourCustomerCheckType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#mmRiskLevel
 * PersonProfile.mmRiskLevel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#mmPerson
 * PersonProfile.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmPoliticalExposureType
 * PersonProfile.mmPoliticalExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmCustomerConductClassification
 * PersonProfile.mmCustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmFamilyMedicalInsuranceIndicator
 * PersonProfile.mmFamilyMedicalInsuranceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
 * PersonProfile.mmProfileCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmSourceOfWealth
 * PersonProfile.mmSourceOfWealth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#mmSalaryRange
 * PersonProfile.mmSalaryRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmPersonProfile
 * Person.mmPersonProfile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate#mmPerson
 * PrivateCertificate.mmPerson}</li>
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
	protected ProvidedCode foreignStatusCertification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<PersonProfile, ProvidedCode> mmForeignStatusCertification = new MMBusinessAttribute<PersonProfile, ProvidedCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignStatusCertification";
			definition = "Specifies if documentary evidence has been provided for the foreign resident.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProvidedCode.mmObject();
		}

		@Override
		public ProvidedCode getValue(PersonProfile obj) {
			return obj.getForeignStatusCertification();
		}

		@Override
		public void setValue(PersonProfile obj, ProvidedCode value) {
			obj.setForeignStatusCertification(value);
		}
	};
	protected YesNoIndicator employeeTerminationIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmEmployeeTerminationIndicator
	 * Garnishment1.mmEmployeeTerminationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment2#mmEmployeeTerminationIndicator
	 * Garnishment2.mmEmployeeTerminationIndicator}</li>
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
	public static final MMBusinessAttribute<PersonProfile, YesNoIndicator> mmEmployeeTerminationIndicator = new MMBusinessAttribute<PersonProfile, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Garnishment1.mmEmployeeTerminationIndicator, Garnishment2.mmEmployeeTerminationIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EmployeeTerminationIndicator";
			definition = "Indicates if the employment of the person has been terminated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PersonProfile obj) {
			return obj.getEmployeeTerminationIndicator();
		}

		@Override
		public void setValue(PersonProfile obj, YesNoIndicator value) {
			obj.setEmployeeTerminationIndicator(value);
		}
	};
	protected KnowYourCustomerCheckTypeCode knowYourCustomerCheckType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<PersonProfile, KnowYourCustomerCheckTypeCode> mmKnowYourCustomerCheckType = new MMBusinessAttribute<PersonProfile, KnowYourCustomerCheckTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KnowYourCustomerCheckType";
			definition = "Specifies the type of due diligence checks carried out on a party. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
		}

		@Override
		public KnowYourCustomerCheckTypeCode getValue(PersonProfile obj) {
			return obj.getKnowYourCustomerCheckType();
		}

		@Override
		public void setValue(PersonProfile obj, KnowYourCustomerCheckTypeCode value) {
			obj.setKnowYourCustomerCheckType(value);
		}
	};
	protected RiskLevelCode riskLevel;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<PersonProfile, RiskLevelCode> mmRiskLevel = new MMBusinessAttribute<PersonProfile, RiskLevelCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RiskLevel";
			definition = "Specifies the customer’s money laundering risk.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RiskLevelCode.mmObject();
		}

		@Override
		public RiskLevelCode getValue(PersonProfile obj) {
			return obj.getRiskLevel();
		}

		@Override
		public void setValue(PersonProfile obj, RiskLevelCode value) {
			obj.setRiskLevel(value);
		}
	};
	protected Person person;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonProfile
	 * Person.mmPersonProfile}</li>
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
	public static final MMBusinessAssociationEnd<PersonProfile, Person> mmPerson = new MMBusinessAssociationEnd<PersonProfile, Person>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Person for which the profile parameters are described.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Person.mmPersonProfile;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Person.mmObject();
		}

		@Override
		public Person getValue(PersonProfile obj) {
			return obj.getPerson();
		}

		@Override
		public void setValue(PersonProfile obj, Person value) {
			obj.setPerson(value);
		}
	};
	protected PoliticalExposureTypeCode politicalExposureType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<PersonProfile, PoliticalExposureTypeCode> mmPoliticalExposureType = new MMBusinessAttribute<PersonProfile, PoliticalExposureTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoliticalExposureType";
			definition = "Specifies if due diligence checks on the political exposure of the investor have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PoliticalExposureTypeCode.mmObject();
		}

		@Override
		public PoliticalExposureTypeCode getValue(PersonProfile obj) {
			return obj.getPoliticalExposureType();
		}

		@Override
		public void setValue(PersonProfile obj, PoliticalExposureTypeCode value) {
			obj.setPoliticalExposureType(value);
		}
	};
	protected ConductClassificationCode customerConductClassification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<PersonProfile, ConductClassificationCode> mmCustomerConductClassification = new MMBusinessAttribute<PersonProfile, ConductClassificationCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustomerConductClassification";
			definition = "Assessment of the customer’s behaviour at the time of the account opening application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConductClassificationCode.mmObject();
		}

		@Override
		public ConductClassificationCode getValue(PersonProfile obj) {
			return obj.getCustomerConductClassification();
		}

		@Override
		public void setValue(PersonProfile obj, ConductClassificationCode value) {
			obj.setCustomerConductClassification(value);
		}
	};
	protected YesNoIndicator familyMedicalInsuranceIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmFamilyMedicalInsuranceIndicator
	 * Garnishment1.mmFamilyMedicalInsuranceIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment2#mmFamilyMedicalInsuranceIndicator
	 * Garnishment2.mmFamilyMedicalInsuranceIndicator}</li>
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
	public static final MMBusinessAttribute<PersonProfile, YesNoIndicator> mmFamilyMedicalInsuranceIndicator = new MMBusinessAttribute<PersonProfile, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Garnishment1.mmFamilyMedicalInsuranceIndicator, Garnishment2.mmFamilyMedicalInsuranceIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FamilyMedicalInsuranceIndicator";
			definition = "Indicates if the person has family medical insurance coverage available. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PersonProfile obj) {
			return obj.getFamilyMedicalInsuranceIndicator();
		}

		@Override
		public void setValue(PersonProfile obj, YesNoIndicator value) {
			obj.setFamilyMedicalInsuranceIndicator(value);
		}
	};
	protected List<PrivateCertificate> profileCertification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmPerson
	 * PrivateCertificate.mmPerson}</li>
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
	public static final MMBusinessAssociationEnd<PersonProfile, List<PrivateCertificate>> mmProfileCertification = new MMBusinessAssociationEnd<PersonProfile, List<PrivateCertificate>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProfileCertification";
			definition = "Information to support the Know Your Customer processes.";
			minOccurs = 0;
			opposite_lazy = () -> PrivateCertificate.mmPerson;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PrivateCertificate.mmObject();
		}

		@Override
		public List<PrivateCertificate> getValue(PersonProfile obj) {
			return obj.getProfileCertification();
		}

		@Override
		public void setValue(PersonProfile obj, List<PrivateCertificate> value) {
			obj.setProfileCertification(value);
		}
	};
	protected Max140Text sourceOfWealth;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<PersonProfile, Max140Text> mmSourceOfWealth = new MMBusinessAttribute<PersonProfile, Max140Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SourceOfWealth";
			definition = "Indicates the main sources of the money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(PersonProfile obj) {
			return obj.getSourceOfWealth();
		}

		@Override
		public void setValue(PersonProfile obj, Max140Text value) {
			obj.setSourceOfWealth(value);
		}
	};
	protected Max35Text salaryRange;
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
	public static final MMBusinessAttribute<PersonProfile, Max35Text> mmSalaryRange = new MMBusinessAttribute<PersonProfile, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SalaryRange";
			definition = "Specifies the level of salary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PersonProfile obj) {
			return obj.getSalaryRange();
		}

		@Override
		public void setValue(PersonProfile obj, Max35Text value) {
			obj.setSalaryRange(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonProfile";
				definition = "Information to support Know Your Customer (KYC) processes.";
				associationDomain_lazy = () -> Arrays.asList(Person.mmPersonProfile, PrivateCertificate.mmPerson);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonProfile.mmForeignStatusCertification, com.tools20022.repository.entity.PersonProfile.mmEmployeeTerminationIndicator,
						com.tools20022.repository.entity.PersonProfile.mmKnowYourCustomerCheckType, com.tools20022.repository.entity.PersonProfile.mmRiskLevel, com.tools20022.repository.entity.PersonProfile.mmPerson,
						com.tools20022.repository.entity.PersonProfile.mmPoliticalExposureType, com.tools20022.repository.entity.PersonProfile.mmCustomerConductClassification,
						com.tools20022.repository.entity.PersonProfile.mmFamilyMedicalInsuranceIndicator, com.tools20022.repository.entity.PersonProfile.mmProfileCertification,
						com.tools20022.repository.entity.PersonProfile.mmSourceOfWealth, com.tools20022.repository.entity.PersonProfile.mmSalaryRange);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PersonProfile.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ProvidedCode getForeignStatusCertification() {
		return foreignStatusCertification;
	}

	public PersonProfile setForeignStatusCertification(ProvidedCode foreignStatusCertification) {
		this.foreignStatusCertification = Objects.requireNonNull(foreignStatusCertification);
		return this;
	}

	public YesNoIndicator getEmployeeTerminationIndicator() {
		return employeeTerminationIndicator;
	}

	public PersonProfile setEmployeeTerminationIndicator(YesNoIndicator employeeTerminationIndicator) {
		this.employeeTerminationIndicator = Objects.requireNonNull(employeeTerminationIndicator);
		return this;
	}

	public KnowYourCustomerCheckTypeCode getKnowYourCustomerCheckType() {
		return knowYourCustomerCheckType;
	}

	public PersonProfile setKnowYourCustomerCheckType(KnowYourCustomerCheckTypeCode knowYourCustomerCheckType) {
		this.knowYourCustomerCheckType = Objects.requireNonNull(knowYourCustomerCheckType);
		return this;
	}

	public RiskLevelCode getRiskLevel() {
		return riskLevel;
	}

	public PersonProfile setRiskLevel(RiskLevelCode riskLevel) {
		this.riskLevel = Objects.requireNonNull(riskLevel);
		return this;
	}

	public Person getPerson() {
		return person;
	}

	public PersonProfile setPerson(Person person) {
		this.person = Objects.requireNonNull(person);
		return this;
	}

	public PoliticalExposureTypeCode getPoliticalExposureType() {
		return politicalExposureType;
	}

	public PersonProfile setPoliticalExposureType(PoliticalExposureTypeCode politicalExposureType) {
		this.politicalExposureType = Objects.requireNonNull(politicalExposureType);
		return this;
	}

	public ConductClassificationCode getCustomerConductClassification() {
		return customerConductClassification;
	}

	public PersonProfile setCustomerConductClassification(ConductClassificationCode customerConductClassification) {
		this.customerConductClassification = Objects.requireNonNull(customerConductClassification);
		return this;
	}

	public YesNoIndicator getFamilyMedicalInsuranceIndicator() {
		return familyMedicalInsuranceIndicator;
	}

	public PersonProfile setFamilyMedicalInsuranceIndicator(YesNoIndicator familyMedicalInsuranceIndicator) {
		this.familyMedicalInsuranceIndicator = Objects.requireNonNull(familyMedicalInsuranceIndicator);
		return this;
	}

	public List<PrivateCertificate> getProfileCertification() {
		return profileCertification == null ? profileCertification = new ArrayList<>() : profileCertification;
	}

	public PersonProfile setProfileCertification(List<PrivateCertificate> profileCertification) {
		this.profileCertification = Objects.requireNonNull(profileCertification);
		return this;
	}

	public Max140Text getSourceOfWealth() {
		return sourceOfWealth;
	}

	public PersonProfile setSourceOfWealth(Max140Text sourceOfWealth) {
		this.sourceOfWealth = Objects.requireNonNull(sourceOfWealth);
		return this;
	}

	public Max35Text getSalaryRange() {
		return salaryRange;
	}

	public PersonProfile setSalaryRange(Max35Text salaryRange) {
		this.salaryRange = Objects.requireNonNull(salaryRange);
		return this;
	}
}