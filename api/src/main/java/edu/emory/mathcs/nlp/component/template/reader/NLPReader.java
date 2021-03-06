/**
 * Copyright 2015, Emory University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.emory.mathcs.nlp.component.template.reader;

import edu.emory.mathcs.nlp.component.template.node.NLPNode;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

/**
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class NLPReader extends TSVReader<NLPNode>
{
	public NLPReader() {super();}
	
	public NLPReader(Object2IntMap<String> map)
	{
		super(map);
	}
	
	public NLPReader(int form, int lemma, int pos, int feats, int dhead, int deprel, int sheads, int nament)
	{
		super(form, lemma, pos, feats, dhead, deprel, sheads, nament);
	}

	@Override
	protected NLPNode create()
	{
		return new NLPNode();
	}
}
