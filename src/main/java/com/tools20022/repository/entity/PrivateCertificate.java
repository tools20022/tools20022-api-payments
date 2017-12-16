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
import com.tools20022.repository.codeset.CertificateTypeCode;
import com.tools20022.repository.codeset.EventFrequencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCertificateType
 * PrivateCertificate.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCertificationIndicator
 * PrivateCertificate.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingDate
 * PrivateCertificate.mmCheckingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingFrequency
 * PrivateCertificate.mmCheckingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmNextRevisionDate
 * PrivateCertificate.mmNextRevisionDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate#mmPerson
 * PrivateCertificate.mmPerson}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
 * PersonProfile.mmProfileCertification}</li>
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
 * "PrivateCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters associated with the production of a certificate to identify the profile of a customer."
 * </li>
 * </ul>
 */
public class PrivateCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CertificateTypeCode certificateType;
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
	public static final MMBusinessAttribute mmCertificateType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateType";
			definition = "Identifies the type of certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CertificateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PrivateCertificate.class.getMethod("getCertificateType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator certificationIndicator;
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
	public static final MMBusinessAttribute mmCertificationIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether the certificate type has been obtained and verified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PrivateCertificate.class.getMethod("getCertificationIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate checkingDate;
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
	public static final MMBusinessAttribute mmCheckingDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CheckingDate";
			definition = "Date at which the certification check has been performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PrivateCertificate.class.getMethod("getCheckingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EventFrequencyCode checkingFrequency;
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
	public static final MMBusinessAttribute mmCheckingFrequency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CheckingFrequency";
			definition = "Specifies how frequently the check is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PrivateCertificate.class.getMethod("getCheckingFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate nextRevisionDate;
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
	public static final MMBusinessAttribute mmNextRevisionDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextRevisionDate";
			definition = "Specifies the date at which the next certification check will be performed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PrivateCertificate.class.getMethod("getNextRevisionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PersonProfile person;
	/**
	 * Profile of a person for which a private certificate is described.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
	 * PersonProfile.mmProfileCertification}</li>
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
	public static final MMBusinessAssociationEnd mmPerson = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Profile of a person for which a private certificate is described.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmProfileCertification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PersonProfile.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PrivateCertificate";
				definition = "Specifies the parameters associated with the production of a certificate to identify the profile of a customer.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonProfile.mmProfileCertification);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PrivateCertificate.mmCertificateType, com.tools20022.repository.entity.PrivateCertificate.mmCertificationIndicator,
						com.tools20022.repository.entity.PrivateCertificate.mmCheckingDate, com.tools20022.repository.entity.PrivateCertificate.mmCheckingFrequency, com.tools20022.repository.entity.PrivateCertificate.mmNextRevisionDate,
						com.tools20022.repository.entity.PrivateCertificate.mmPerson);
			}

			@Override
			public Class<?> getInstanceClass() {
				return PrivateCertificate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CertificateTypeCode getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(CertificateTypeCode certificateType) {
		this.certificateType = certificateType;
	}

	public YesNoIndicator getCertificationIndicator() {
		return certificationIndicator;
	}

	public void setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = certificationIndicator;
	}

	public ISODate getCheckingDate() {
		return checkingDate;
	}

	public void setCheckingDate(ISODate checkingDate) {
		this.checkingDate = checkingDate;
	}

	public EventFrequencyCode getCheckingFrequency() {
		return checkingFrequency;
	}

	public void setCheckingFrequency(EventFrequencyCode checkingFrequency) {
		this.checkingFrequency = checkingFrequency;
	}

	public ISODate getNextRevisionDate() {
		return nextRevisionDate;
	}

	public void setNextRevisionDate(ISODate nextRevisionDate) {
		this.nextRevisionDate = nextRevisionDate;
	}

	public PersonProfile getPerson() {
		return person;
	}

	public void setPerson(com.tools20022.repository.entity.PersonProfile person) {
		this.person = person;
	}
}