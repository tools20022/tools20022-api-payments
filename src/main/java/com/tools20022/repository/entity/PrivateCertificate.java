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
import com.tools20022.repository.codeset.CertificateTypeCode;
import com.tools20022.repository.codeset.EventFrequencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the parameters associated with the production of a certificate to
 * identify the profile of a customer.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PrivateCertificate" src="doc-files/PrivateCertificate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#CertificateType
 * PrivateCertificate.CertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#CertificationIndicator
 * PrivateCertificate.CertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#CheckingDate
 * PrivateCertificate.CheckingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#CheckingFrequency
 * PrivateCertificate.CheckingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#NextRevisionDate
 * PrivateCertificate.NextRevisionDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate#Person
 * PrivateCertificate.Person}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#ProfileCertification
 * PersonProfile.ProfileCertification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
 * "PrivateCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters associated with the production of a certificate to identify the profile of a customer."
 * </li>
 * </ul>
 */
public class PrivateCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the type of certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CertificateTypeCode
	 * CertificateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of certificate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CertificateType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateType";
			definition = "Identifies the type of certificate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CertificateTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether the certificate type has been obtained and verified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the certificate type has been obtained and verified."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CertificationIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether the certificate type has been obtained and verified.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date at which the certification check has been performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the certification check has been performed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CheckingDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CheckingDate";
			definition = "Date at which the certification check has been performed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies how frequently the check is performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how frequently the check is performed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CheckingFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CheckingFrequency";
			definition = "Specifies how frequently the check is performed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies the date at which the next certification check will be
	 * performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextRevisionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date at which the next certification check will be performed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NextRevisionDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextRevisionDate";
			definition = "Specifies the date at which the next certification check will be performed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Profile of a person for which a private certificate is described.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#ProfileCertification
	 * PersonProfile.ProfileCertification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PersonProfile
	 * PersonProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Profile of a person for which a private certificate is described."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Person = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PrivateCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Profile of a person for which a private certificate is described.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PersonProfile.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PersonProfile.ProfileCertification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PrivateCertificate";
				definition = "Specifies the parameters associated with the production of a certificate to identify the profile of a customer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonProfile.ProfileCertification);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PrivateCertificate.CertificateType, com.tools20022.repository.entity.PrivateCertificate.CertificationIndicator,
						com.tools20022.repository.entity.PrivateCertificate.CheckingDate, com.tools20022.repository.entity.PrivateCertificate.CheckingFrequency, com.tools20022.repository.entity.PrivateCertificate.NextRevisionDate,
						com.tools20022.repository.entity.PrivateCertificate.Person);
			}
		});
		return mmObject_lazy.get();
	}
}